package br.inatel.almeidafelpo.pokeplace;

import br.inatel.almeidafelpo.pokeplace.colored.Colored;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("From 0 to 8, how many badges do you have?");
        int client_badges = input.nextInt();
        Colored colored = new Colored();

        PokeStore pokeStore = new PokeStore();

        pokeStore.refreshStore();
        pokeStore.showCatalogue(client_badges);

    }

}
