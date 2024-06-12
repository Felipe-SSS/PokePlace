package br.inatel.almeidafelpo.pokeplace;

import br.inatel.almeidafelpo.pokeplace.Trainer.PokeTrainer;
import br.inatel.almeidafelpo.pokeplace.colored.Colored;
import br.inatel.almeidafelpo.pokeplace.products.Product;
import br.inatel.almeidafelpo.pokeplace.products.misc.Misc;
import br.inatel.almeidafelpo.pokeplace.products.pokeballs.PokeBall;
import br.inatel.almeidafelpo.pokeplace.products.potions.Potion;
import br.inatel.almeidafelpo.pokeplace.products.status_healings.StatusHealing;

import java.util.HashSet;
import java.util.Scanner;

public class PokeStore implements Interface {

    Colored colored = new Colored();
    Scanner input = new Scanner(System.in);

    public PokeTrainer client = new PokeTrainer();

    private static HashSet<PokeBall> pokeBalls = new HashSet<>();
    private static HashSet<Potion> potions = new HashSet<>();
    private static HashSet<StatusHealing> statusHealings = new HashSet<>();
    private static HashSet<Misc> miscs = new HashSet<>();

    private static HashSet<Product> productPokeBalls = new HashSet<>();
    private static HashSet<Product> productPotions= new HashSet<>();
    private static HashSet<Product> productStatusHealings = new HashSet<>();
    private static HashSet<Product> productMiscs = new HashSet<>();


    public void refreshStore(){
        pokeBalls = ReadFiles.getRegisteredPokeballs();
        potions = ReadFiles.getRegisteredPotions();
        statusHealings = ReadFiles.getRegisteredStatusHealings();
        miscs = ReadFiles.getRegisteredMisc();
    }

    private void awaitPurchase(HashSet<Product> products){

        System.out.println();

        colored.colorPrint("CYAN", "BLACK", "What's the number of the product you'd like to buy? (Insert 0 if you'd like to go back to the catalogue)");

        System.out.println();

        System.out.print("Purchase option: ");

        int purchaseOption = input.nextInt() - 1;

        if(purchaseOption == -1){

            colored.colorPrint("CYAN", "BLACK", "Exiting to the PokeStore...");

            showCatalogue(client);
        }

        if (purchaseOption < products.toArray().length && purchaseOption > 0){

        }

    }

    @Override
    public void showCatalogue(PokeTrainer pokeTrainer){

        refreshStore();

        client = pokeTrainer;

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

        System.out.println();

        int i;

        switch (answer)
        {
            case 0:

                System.out.println();
                colored.colorPrint("BLACK", "CYAN", "Come back anytime! (´･ᴗ･`) ");
                return;

            case 1:

                i = 0;

                colored.colorPrint("RED", "BLACK", "These are the PokeBalls we have for you:");

                for(PokeBall pokeBall : pokeBalls) {
                    i++;
                    System.out.println();
                    pokeBall.showInfo(pokeTrainer.getBadges(), i);

                    productPokeBalls.add((Product) pokeBall);

                }

                awaitPurchase(productPokeBalls);

                break;

            case 2:

                i = 0;

                colored.colorPrint("RED", "BLACK", "These are the Potions we have for you:");
                System.out.println();

                for(Potion potion : potions)
                {
                    i++;
                    System.out.println();
                    potion.showInfo(pokeTrainer.getBadges(), i);

                    productPotions.add((Product) potion);
                }

                awaitPurchase(productPotions);

                break;

            case 3:

                i = 0;

                colored.colorPrint("RED", "BLACK", "These are the Status Healings we have for you:");
                System.out.println();

                for (StatusHealing statusHealing : statusHealings)
                {
                    i++;
                    System.out.println();
                    statusHealing.showInfo(pokeTrainer.getBadges(), i);

                    productStatusHealings.add((Product) statusHealing);
                }

                awaitPurchase(productStatusHealings);

                break;

            case 4:

                i = 0;

                colored.colorPrint("RED", "BLACK", "These are some other options we have for you:");
                System.out.println();

                for (Misc misc : miscs)
                {
                    i++;
                    System.out.println();
                    misc.showInfo(pokeTrainer.getBadges(), i);
                    productMiscs.add((Product) misc);
                }

                awaitPurchase(productMiscs);

                break;
        }

    }
}