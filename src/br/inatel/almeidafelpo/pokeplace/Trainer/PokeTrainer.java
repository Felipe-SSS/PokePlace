package br.inatel.almeidafelpo.pokeplace.Trainer;

import java.util.Scanner;

public class PokeTrainer {
    String trainerName;
    String nickname;
    Float pokecoins;
    int badges;
    PokeBag bag;
    public int badges() {
        Scanner input =new Scanner(System.in);

        System.out.println("How much badges you have?");
        return input.nextInt();
    }
}
