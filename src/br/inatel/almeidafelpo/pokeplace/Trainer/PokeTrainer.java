package br.inatel.almeidafelpo.pokeplace.Trainer;

import br.inatel.almeidafelpo.pokeplace.colored.Colored;
import br.inatel.almeidafelpo.pokeplace.products.Product;
import br.inatel.almeidafelpo.pokeplace.products.misc.Misc;
import br.inatel.almeidafelpo.pokeplace.products.pokeballs.PokeBall;
import br.inatel.almeidafelpo.pokeplace.products.potions.Potion;
import br.inatel.almeidafelpo.pokeplace.products.status_healings.StatusHealing;

import java.util.Scanner;

public class PokeTrainer {

    private String trainerName;
    private String nickname;
    private Float pokecoins;
    private int badges;
    private PokeBag bag;

    private Colored colored = new Colored();

    public void showPokeBag(){
        colored.colorPrint("YELLOW", "BLACK", "Here's your PokeBag! Select what you'd like to see.");

        System.out.println();

        System.out.println("1 - PokeBalls");
        System.out.println("2 - Potions");
        System.out.println("3 - Status Healings");
        System.out.println("4 - Misc");

    }

    public void insertPurchase(Product product){

        if(product instanceof PokeBall){
            bag.pokeBalls.add((PokeBall) product);
        } else if (product instanceof Potion) {
            bag.potions.add((Potion) product);
        }
        else if (product instanceof StatusHealing) {
            bag.statusHealings.add((StatusHealing) product);
        }
        else if (product instanceof Misc) {
            bag.miscs.add((Misc) product);
        }

    }

    public void badges() {

        Scanner input = new Scanner(System.in);

        colored.colorPrint("CYAN", "BLACK", "First of all, from 0 to 8, how many badges do you have?");

        System.out.println();

        System.out.print("Badges ammount: ");

        setBadges(input.nextInt());

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
