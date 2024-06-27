package br.inatel.almeidafelpo.pokeplace.Trainer;

import br.inatel.almeidafelpo.pokeplace.Main;
import br.inatel.almeidafelpo.pokeplace.colored.Colored;
import br.inatel.almeidafelpo.pokeplace.products.Product;
import br.inatel.almeidafelpo.pokeplace.store.PokeStore;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PokeTrainer {

    private String trainerName;
    private String nickname;
    private Float pokecoins;
    private int badges;
    private static PokeBag bag;

    private static Colored colored = new Colored();
    private static Scanner input = new Scanner(System.in);

    private int userInput = 1;

    public void userInteractions(PokeStore pokeStore){

        do {

            if (Main.firstTime){
                System.out.println();
                colored.colorPrint("GREEN", "===========================================");
                System.out.println();
                colored.colorPrint("CYAN", "BLACK", "What would you like to see first?");
                Main.firstTime = false;
            }

            else{
                System.out.println();
                colored.colorPrint("GREEN", "===========================================");
                System.out.println();
                colored.colorPrint("CYAN", "BLACK", "What would you like to see?");
            }

            System.out.println();

            System.out.println("1 - PokeStore");
            System.out.println("2 - PokeBag");

            System.out.println();

            System.out.println("0 - End process...");

            System.out.println();

            System.out.print("Option input: ");
            try {
                userInput = input.nextInt();

                switch (userInput){

                    case 0:
                        System.out.println();
                        colored.colorPrint("RED", "BLACK", "Come back anytime!");
                        return;

                    case 1:

                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        pokeStore.showCatalogue(this);
                        break;

                    case 2:

                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        bag.viewBag(false);
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid value");
                input.next();
            }


        } while (userInput != 0);
    }

    public void insertPurchase(Product product){

        Item newItem = new Item(product, 1);

        boolean found = false;
        for (Item item : bag.items) {
            if (item.getProduct().getClass() == product.getClass()) {
                item.setAmount(item.getAmount() + 1);
                found = true;
                break;
            }
        }

        if (!found) {
            bag.items.add(newItem);
        }


    }

    public void badges() {

        Scanner input = new Scanner(System.in);

        colored.colorPrint("CYAN", "BLACK", "First of all, from 0 to 8, how many badges do you have?");

        System.out.println();

        System.out.print("Badges ammount: ");

        int badges_input;


        try {
            badges_input = input.nextInt();
            if(badges_input >= 0 && badges_input <= 8)
                this.setBadges(badges_input);
            else{
                System.out.println("Invalid number");
                this.badges();
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid value");
            this.badges();
        }

    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Float getPokecoins() {
        return pokecoins;
    }

    public void setPokecoins(Float pokecoins) {
        this.pokecoins = pokecoins;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public PokeBag getBag() {
        return bag;
    }

    public void setBag(PokeBag bag) {
        this.bag = bag;
    }
}
