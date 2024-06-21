package br.inatel.almeidafelpo.pokeplace;

import br.inatel.almeidafelpo.pokeplace.Trainer.PokeTrainer;
import br.inatel.almeidafelpo.pokeplace.colored.Colored;
import br.inatel.almeidafelpo.pokeplace.store.PokeStore;

import java.util.Scanner;

public class Main {

    public static boolean firstTime;

    private static Colored colored = new Colored();

    private static Scanner input = new Scanner(System.in);

    public static void main(String [] args){

        System.out.print("\033[H\033[2J");
        System.out.flush();

        colored.colorPrint("YELLOW", "BLACK", "Welcome to your favorite PokeSystem! (∿°○°)∿");

        System.out.println();

        PokeTrainer pokeTrainer = new PokeTrainer();

        pokeTrainer.badges();

        PokeStore pokeStore = new PokeStore();

        System.out.println();

        firstTime = true;

        pokeTrainer.userInteractions(pokeStore);

    }

}