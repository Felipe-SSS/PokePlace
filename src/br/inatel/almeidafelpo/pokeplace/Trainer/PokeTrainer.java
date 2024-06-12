package br.inatel.almeidafelpo.pokeplace.Trainer;

import java.util.Scanner;

public class PokeTrainer {

    String trainerName;
    String nickname;
    Float pokecoins;
    public int badges;
    PokeBag bag;

    public void badges() {
        Scanner input = new Scanner(System.in);

        System.out.println("From 0 to 8, how many badges do you have?");

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
