package br.inatel.almeidafelpo.pokeplace;

import br.inatel.almeidafelpo.pokeplace.Trainer.PokeTrainer;
import br.inatel.almeidafelpo.pokeplace.colored.Colored;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        System.out.print("\033[H\033[2J");
        System.out.flush();

        Colored colored = new Colored();

        Scanner input = new Scanner(System.in);

        colored.colorPrint("YELLOW", "BLACK", "Welcome to your favorite PokeSystem! (∿°○°)∿");

        System.out.println();

        PokeTrainer pokeTrainer = new PokeTrainer();

        pokeTrainer.badges();

        PokeStore pokeStore = new PokeStore();

        System.out.println();

        colored.colorPrint("CYAN", "BLACK", "What would you like to see first?");

        System.out.println();

        System.out.println("1 - PokeStore");
        System.out.println("2 - PokeBag");

        System.out.println();

        System.out.print("Option input: ");

        switch (input.nextInt()){

            case 1:

                System.out.print("\033[H\033[2J");
                System.out.flush();

                pokeStore.showCatalogue(pokeTrainer);
                break;

            case 2:

                System.out.print("\033[H\033[2J");
                System.out.flush();

                pokeTrainer.showPokeBag();
                break;

        }



    }

}