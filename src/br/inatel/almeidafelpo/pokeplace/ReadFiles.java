package br.inatel.almeidafelpo.pokeplace;

import br.inatel.almeidafelpo.pokeplace.products.pokeballs.*;
import br.inatel.almeidafelpo.pokeplace.products.potions.*;
import br.inatel.almeidafelpo.pokeplace.products.status_healings.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class ReadFiles {

    public static HashSet<PokeBall> getRegisteredPokeballs(){

        HashSet<PokeBall> allPokeballs = new HashSet<>();

        try {
            File pokeballsFile = new File("TextFiles/pokeballs.txt");
            Scanner fileReader = new Scanner(pokeballsFile);

            float price;
            String description;
            int badges;
            String name;



            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                switch (line){

                    case "PokeBall":
                        name = "Pokeball";
                        price = Float.valueOf(fileReader.nextLine());
                        description = fileReader.nextLine();
                        badges = Integer.valueOf(fileReader.nextLine());
                        PokeBall pokeBall = new PokeBall(price, description, badges, name);
                        allPokeballs.add(pokeBall);
                        if(fileReader.hasNextLine())
                            break;
                    case "QuickBall":
                        name = "Quickball";
                        price = Float.valueOf(fileReader.nextLine());
                        description = fileReader.nextLine();
                        badges = Integer.valueOf(fileReader.nextLine());
                        QuickBall quickBall = new QuickBall(price, description, badges,name);
                        allPokeballs.add(quickBall);
                        if(fileReader.hasNextLine())
                            break;

                    case "TimerBall":
                        name = "Timerball";
                        price = Float.valueOf(fileReader.nextLine());
                        description = fileReader.nextLine();
                        badges = Integer.valueOf(fileReader.nextLine());
                        TimerBall timerBall = new TimerBall(price, description, badges,name);
                        allPokeballs.add(timerBall);
                        if(fileReader.hasNextLine())
                            break;

                    case "GreatBall":
                        name = "Greatball";
                        price = Float.valueOf(fileReader.nextLine());
                        description = fileReader.nextLine();
                        badges = Integer.valueOf(fileReader.nextLine());
                        GreatBall greatBall = new GreatBall(price, description, badges,name);
                        allPokeballs.add(greatBall);
                        if(fileReader.hasNextLine())
                            break;

                    case "UltraBall":
                        name = "Ultraball";
                        price = Float.valueOf(fileReader.nextLine());
                        description = fileReader.nextLine();
                        badges = Integer.valueOf(fileReader.nextLine());
                        UltraBall ultraBall = new UltraBall(price, description, badges,name);
                        allPokeballs.add(ultraBall);
                        if(fileReader.hasNextLine())
                            break;
                }
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return allPokeballs;
    }

    public static HashSet<Potion> getRegisteredPotions() {

        HashSet<Potion> allPotions = new HashSet<>();

        try {
            File potionsFile = new File("TextFiles/potions.txt");
            Scanner fileReader = new Scanner(potionsFile);

            float price;
            String description;
            int badgeAmount;
            float healAmount;
            String name;


            while (fileReader.hasNextLine()) {
                String potionType = fileReader.nextLine();

                switch (potionType) {
                    case "Potion":
                        name = "Potion";
                        price = Float.valueOf(fileReader.nextLine());
                        description = fileReader.nextLine();
                        badgeAmount = Integer.valueOf(fileReader.nextLine());
                        healAmount = Float.valueOf(fileReader.nextLine());
                        Potion potion = new Potion(price, description, badgeAmount, healAmount, name);
                        allPotions.add(potion);
                        break;

                    case "SuperPotion":
                        name = "Super potion";
                        price = Float.valueOf(fileReader.nextLine());
                        description = fileReader.nextLine();
                        badgeAmount = Integer.valueOf(fileReader.nextLine());
                        healAmount = Float.valueOf(fileReader.nextLine());
                        SuperPotion superPotion = new SuperPotion(price, description, badgeAmount, healAmount, name);
                        allPotions.add(superPotion);
                        break;

                    case "HyperPotion":
                        name = "Hyper potion";
                        price = Float.valueOf(fileReader.nextLine());
                        description = fileReader.nextLine();
                        badgeAmount = Integer.valueOf(fileReader.nextLine());
                        healAmount = Float.valueOf(fileReader.nextLine());
                        HyperPotion hyperPotion = new HyperPotion(price, description, badgeAmount, healAmount, name);
                        allPotions.add(hyperPotion);
                        break;

                    case "MaxPotion":
                        name = "Max potion";
                        price = Float.valueOf(fileReader.nextLine());
                        description = fileReader.nextLine();
                        badgeAmount = Integer.valueOf(fileReader.nextLine());
                        healAmount = Float.valueOf(fileReader.nextLine());
                        MaxPotion maxPotion = new MaxPotion(price, description, badgeAmount, healAmount,name);
                        allPotions.add(maxPotion);
                        break;

                    case "FullRestore":
                        name = "Full Restore";
                        price = Float.valueOf(fileReader.nextLine());
                        description = fileReader.nextLine();
                        badgeAmount = Integer.valueOf(fileReader.nextLine());
                        healAmount = Float.valueOf(fileReader.nextLine());
                        FullRestore fullRestore = new FullRestore(price, description, badgeAmount, healAmount,name);
                        allPotions.add(fullRestore);
                        break;
                }
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return allPotions;
    }

    public static HashSet<StatusHealing> getRegisteredStatusHealings() {

        HashSet<StatusHealing> allStatusHealings = new HashSet<>();

        try {
            File statusHealingsFile = new File("TextFiles/status_healings.txt");
            Scanner fileReader = new Scanner(statusHealingsFile);

            String name;
            float price;
            String description;
            int badgeAmount;
            String target_status;

            while (fileReader.hasNextLine()) {
                String statusHealingType = fileReader.nextLine();

                switch (statusHealingType) {
                    case "Antidote":
                        name = "Antidote";
                        description = fileReader.nextLine();
                        badgeAmount = Integer.valueOf(fileReader.nextLine());
                        price = Float.valueOf(fileReader.nextLine());
                        target_status = fileReader.nextLine();
                        Antidote antidote = new Antidote(price, description, badgeAmount, target_status,name);
                        allStatusHealings.add(antidote);
                        break;

                    case "Awakening":
                        name= "Awakening";
                        description = fileReader.nextLine();
                        badgeAmount = Integer.valueOf(fileReader.nextLine());
                        price = Float.valueOf(fileReader.nextLine());
                        target_status = fileReader.nextLine();
                        Awakening awakening = new Awakening(price, description, badgeAmount, target_status,name);
                        allStatusHealings.add(awakening);
                        break;

                    case "Paralyze Heal":
                        name="Paralyze Heal";
                        description = fileReader.nextLine();
                        badgeAmount = Integer.valueOf(fileReader.nextLine());
                        price = Float.valueOf(fileReader.nextLine());
                        target_status = fileReader.nextLine();
                        ParalyzeHeal paralyzeHeal = new ParalyzeHeal(price, description, badgeAmount, target_status, name);
                        allStatusHealings.add(paralyzeHeal);
                        break;

                    case "Burn Heal":
                        name = "Burn Heal";
                        description = fileReader.nextLine();
                        badgeAmount = Integer.valueOf(fileReader.nextLine());
                        price = Float.valueOf(fileReader.nextLine());
                        target_status = fileReader.nextLine();
                        BurnHeal burnHeal = new BurnHeal(price, description, badgeAmount, target_status,name);
                        allStatusHealings.add(burnHeal);
                        break;

                    case "Ice Heal":
                        name = "Ice Heal";
                        description = fileReader.nextLine();
                        badgeAmount = Integer.valueOf(fileReader.nextLine());
                        price = Float.valueOf(fileReader.nextLine());
                        target_status = fileReader.nextLine();
                        IceHeal iceHeal = new IceHeal(price, description, badgeAmount, target_status,name);
                        allStatusHealings.add(iceHeal);
                        break;

                    case "Full Heal":
                        name = "Full Heal";
                        description = fileReader.nextLine();
                        badgeAmount = Integer.valueOf(fileReader.nextLine());
                        price = Float.valueOf(fileReader.nextLine());
                        target_status = fileReader.nextLine();
                        FullHeal fullHeal = new FullHeal(price, description, badgeAmount, target_status,name);
                        allStatusHealings.add(fullHeal);
                        break;
                }
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return allStatusHealings;
    }

}
