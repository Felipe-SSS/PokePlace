package br.inatel.almeidafelpo.pokeplace;

import br.inatel.almeidafelpo.pokeplace.Trainer.PokeTrainer;
import br.inatel.almeidafelpo.pokeplace.colored.Colored;
import br.inatel.almeidafelpo.pokeplace.products.misc.Misc;
import br.inatel.almeidafelpo.pokeplace.products.pokeballs.PokeBall;
import br.inatel.almeidafelpo.pokeplace.products.potions.Potion;
import br.inatel.almeidafelpo.pokeplace.products.status_healings.StatusHealing;

import java.util.HashSet;
import java.util.Scanner;

public class PokeStore implements Interface {

    public PokeTrainer client = new PokeTrainer();

    public static HashSet<PokeBall> pokeBalls = new HashSet<>();
    public static HashSet<Potion> potions = new HashSet<>();
    public static HashSet<StatusHealing> statusHealings = new HashSet<>();
    public static HashSet<Misc> miscs = new HashSet<>();

    public void refreshStore(){
        pokeBalls = ReadFiles.getRegisteredPokeballs();
        potions = ReadFiles.getRegisteredPotions();
        statusHealings = ReadFiles.getRegisteredStatusHealings();
        miscs = ReadFiles.getRegisteredMisc();
    }

    Colored colored = new Colored();

    @Override
    public void showCatalogue(int client_badges){

        Scanner input = new Scanner(System.in);

        System.out.println();
        colored.colorPrint("BLACK", "CYAN", "Welcome to the PokeStore!");
        System.out.println();
        colored.colorPrint("GREEN", "===========================================");
        System.out.println();
        colored.colorPrint("BLACK", "CYAN", "What would you like to buy?");
        System.out.println();

        System.out.println("1 - Pokeballs");
        System.out.println("2 - Potions");
        System.out.println("3 - Status Healing");
        System.out.println("4 - Misc");

        System.out.println();

        System.out.println("0 - Leave PokeStore...");

        System.out.println();

        System.out.print("Option input: ");

        int answer = input.nextInt();

        int i;

        switch (answer)
        {
            case 0:
                System.out.println();
                colored.colorPrint("BLACK", "CYAN", "Come back anytime! (´･ᴗ･`) ");
                return;

            case 1:

                i = 0;

                for(PokeBall pokeBall : pokeBalls) {
                    i++;
                    System.out.println();
                    pokeBall.showInfo(client_badges, i);
                }
                break;

            case 2:

                i = 0;

                for(Potion potion : potions)
                {
                    i++;
                    System.out.println();
                    potion.showInfo(client_badges, i);
                }
                break;

            case 3:

                i = 0;

                for (StatusHealing statusHealing : statusHealings)
                {
                    i++;
                    System.out.println();
                    statusHealing.showInfo(client_badges, i);
                }
                break;

            case 4:

                i = 0;

                for (Misc misc : miscs)
                {
                    i++;
                    System.out.println();
                    misc.showInfo(client_badges, i);
                }
                break;
        }

    }
}