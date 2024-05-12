package br.inatel.almeidafelpo.pokeplace;

import br.inatel.almeidafelpo.pokeplace.products.pokeballs.PokeBall;
import br.inatel.almeidafelpo.pokeplace.products.potions.Potion;
import br.inatel.almeidafelpo.pokeplace.products.status_healings.StatusHealing;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("How many badges do you have?");
        int client_badges = input.nextInt();


        HashSet<PokeBall> pokeBalls = ReadFiles.getRegisteredPokeballs();
        HashSet<Potion> potions = ReadFiles.getRegisteredPotions();
        HashSet<StatusHealing> statusHealings = ReadFiles.getRegisteredStatusHealings();


        // nao consegui passar para a interface
        // so comecei falta fazer o resto
        System.out.println("What would you like to see?");
        System.out.println("1- Pokeballs");
        System.out.println("2- Potions");
        System.out.println("3- Status Healing");
        int answer = input.nextInt();


        switch (answer)
        {
            case 1:
                for(PokeBall elements : pokeBalls) {
                    elements.showInfo(client_badges);
                }
                    break;
            case 2:
                for(Potion elements : potions)
                {
                    elements.showInfo(client_badges);
                }
                    break;
            case 3:
                for (StatusHealing elements : statusHealings)
                {
                    elements.showInfo(client_badges);
                }
                    break;
        }
    }

}
