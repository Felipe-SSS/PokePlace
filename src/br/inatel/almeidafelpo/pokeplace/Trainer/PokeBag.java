package br.inatel.almeidafelpo.pokeplace.Trainer;

import br.inatel.almeidafelpo.pokeplace.colored.Colored;
import br.inatel.almeidafelpo.pokeplace.products.misc.Misc;
import br.inatel.almeidafelpo.pokeplace.products.pokeballs.PokeBall;
import br.inatel.almeidafelpo.pokeplace.products.potions.Potion;
import br.inatel.almeidafelpo.pokeplace.products.status_healings.StatusHealing;

import java.util.HashSet;
import java.util.Scanner;

public class PokeBag {

    private Colored colored = new Colored();

    private Scanner input = new Scanner(System.in);

    public HashSet<Item> items = new HashSet<>();

    public void viewBag(boolean repeat){

        if (!repeat){
            System.out.println();
            colored.colorPrint("GREEN", "===========================================");
            System.out.println();
            colored.colorPrint("BLACK", "CYAN", "Welcome to your PokeBag!");
            System.out.println();
            colored.colorPrint("GREEN", "===========================================");
            System.out.println();
            colored.colorPrint("CYAN", "BLACK", "What would you like to see?");
        }
        else{
            System.out.println();
            colored.colorPrint("GREEN", "===========================================");
            System.out.println();
            colored.colorPrint("CYAN", "BLACK", "What would you like to see?");
        }


        System.out.println();

        System.out.println("1 - PokeBalls");
        System.out.println("2 - Potions");
        System.out.println("3 - Status Healings");
        System.out.println("4 - Misc");

        System.out.println();

        System.out.println("0 - Exit PokeBag...");

        System.out.println();

        System.out.print("Option input: ");

        int userInput = input.nextInt();

        System.out.println();

        int i = 0;

        switch (userInput)
        {
            case 0:

                colored.colorPrint("BLACK", "CYAN", "Come back anytime! (´･ᴗ･`) ");

                return;

            case 1:

                i = 1;

                colored.colorPrint("CYAN", "BLACK", "Here are your PokeBalls!");
                System.out.println();

                for (Item item : items){
                    if (item.getProduct() instanceof PokeBall){
                        item.getProduct().showInfo(8, i, true);
                        System.out.println("Amount owned: " + item.getAmount());
                        i++;
                    }
                }


                break;

            case 2:

                i = 1;

                colored.colorPrint("CYAN", "BLACK", "Here are your Potions!");
                System.out.println();

                for (Item item : items){
                    if (item.getProduct() instanceof Potion){
                        item.getProduct().showInfo(8, i, true);
                        System.out.println("Amount owned: " + item.getAmount());
                        i++;
                    }
                }

                break;

            case 3:

                i = 1;

                colored.colorPrint("CYAN", "BLACK", "Here are your Status Healings!");
                System.out.println();

                for (Item item : items){
                    if (item.getProduct() instanceof StatusHealing){
                        item.getProduct().showInfo(8, i, true);
                        System.out.println("Amount owned: " + item.getAmount());
                        i++;
                    }
                }

                break;

            case 4:

                i = 1;

                colored.colorPrint("CYAN", "BLACK", "Here are your misc items!");
                System.out.println();

                for (Item item : items){
                    if (item.getProduct() instanceof Misc){
                        item.getProduct().showInfo(8, i, true);
                        System.out.println("Amount owned: " + item.getAmount());
                        i++;
                    }
                }

                break;
        }

        viewBag(true);

    }

}
