package br.inatel.almeidafelpo.pokeplace;

import br.inatel.almeidafelpo.pokeplace.colored.Colored;
import br.inatel.almeidafelpo.pokeplace.products.pokeballs.PokeBall;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        HashSet<PokeBall> pokeballs = new HashSet<>();

        System.out.println("Welcome to PokeMarket!!");
        System.out.println("How many badges do you have?");
        int client_badges = input.nextInt();

        pokeballs = ReadFiles.getRegisteredPokeballs();
        // falta a interface e as corzinha
        System.out.println("Would like to buy pokeballs?");
        System.out.println("Enter 1.");
        int answer = input.nextInt();
        switch (answer)
        {
            case 1:
                for(PokeBall elemento : pokeballs){
                    elemento.showInfo(client_badges);
                }
        }





    }
}
