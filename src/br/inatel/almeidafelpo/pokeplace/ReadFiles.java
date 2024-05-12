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

            String line;
            line = fileReader.nextLine();

            while (fileReader.hasNextLine()) {
                switch (line){

                    case "PokeBall":
                        price = Float.valueOf(fileReader.nextLine());
                        description = fileReader.nextLine();
                        badges = Integer.valueOf(fileReader.nextLine());
                        PokeBall pokeBall = new PokeBall(price, description, badges);
                        allPokeballs.add(pokeBall);
                        if(fileReader.hasNextLine())
                        {line = fileReader.nextLine();}
                    case "QuickBall":
                        price = Float.valueOf(fileReader.nextLine());
                        description = fileReader.nextLine();
                        badges = Integer.valueOf(fileReader.nextLine());
                        QuickBall quickBall = new QuickBall(price, description, badges);
                        allPokeballs.add(quickBall);
                        if(fileReader.hasNextLine())
                        {line = fileReader.nextLine();}

                    case "TimerBall":
                        price = Float.valueOf(fileReader.nextLine());
                        description = fileReader.nextLine();
                        badges = Integer.valueOf(fileReader.nextLine());
                        TimerBall timerBall = new TimerBall(price, description, badges);
                        allPokeballs.add(timerBall);
                        if(fileReader.hasNextLine())
                        {line = fileReader.nextLine();}

                    case "GreatBall":
                        price = Float.valueOf(fileReader.nextLine());
                        description = fileReader.nextLine();
                        badges = Integer.valueOf(fileReader.nextLine());
                        GreatBall greatBall = new GreatBall(price, description, badges);
                        allPokeballs.add(greatBall);
                        if(fileReader.hasNextLine())
                        {line = fileReader.nextLine();}

                    case "UltraBall":
                        price = Float.valueOf(fileReader.nextLine());
                        description = fileReader.nextLine();
                        badges = Integer.valueOf(fileReader.nextLine());
                        UltraBall ultraBall = new UltraBall(price, description, badges);
                        allPokeballs.add(ultraBall);
                        if(fileReader.hasNextLine())
                        {line = fileReader.nextLine();}
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

            while (fileReader.hasNextLine()) {
                String potionType = fileReader.nextLine();

                switch (potionType) {
                    case "Potion":
                        price = fileReader.nextFloat();
                        description = fileReader.nextLine();
                        badgeAmount = fileReader.nextInt();
                        healAmount = fileReader.nextFloat();
                        Potion potion = new Potion(price, description, badgeAmount, healAmount);
                        allPotions.add(potion);
                        break;

                    case "SuperPotion":
                        price = fileReader.nextFloat();
                        description = fileReader.nextLine();
                        badgeAmount = fileReader.nextInt();
                        healAmount = fileReader.nextFloat();
                        SuperPotion superPotion = new SuperPotion(price, description, badgeAmount, healAmount);
                        allPotions.add(superPotion);
                        break;

                    case "HyperPotion":
                        price = fileReader.nextFloat();
                        description = fileReader.nextLine();
                        badgeAmount = fileReader.nextInt();
                        healAmount = fileReader.nextFloat();
                        HyperPotion hyperPotion = new HyperPotion(price, description, badgeAmount, healAmount);
                        allPotions.add(hyperPotion);
                        break;

                    case "MaxPotion":
                        price = fileReader.nextFloat();
                        description = fileReader.nextLine();
                        badgeAmount = fileReader.nextInt();
                        healAmount = fileReader.nextFloat();
                        MaxPotion maxPotion = new MaxPotion(price, description, badgeAmount, healAmount);
                        allPotions.add(maxPotion);
                        break;

                    case "FullRestore":
                        price = fileReader.nextFloat();
                        description = fileReader.nextLine();
                        badgeAmount = fileReader.nextInt();
                        healAmount = fileReader.nextFloat();
                        FullRestore fullRestore = new FullRestore(price, description, badgeAmount, healAmount);
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

            float price;
            String description;
            int badgeAmount;
            String target_status;

            while (fileReader.hasNextLine()) {
                String statusHealingType = fileReader.nextLine();

                switch (statusHealingType) {
                    case "Antidote":
                        price = fileReader.nextFloat();
                        description = fileReader.nextLine();
                        badgeAmount = fileReader.nextInt();
                        target_status = fileReader.nextLine();
                        Antidote antidote = new Antidote(price, description, badgeAmount, target_status);
                        allStatusHealings.add(antidote);
                        break;

                    case "Awakening":
                        price = fileReader.nextFloat();
                        description = fileReader.nextLine();
                        badgeAmount = fileReader.nextInt();
                        target_status = fileReader.nextLine();
                        Awakening awakening = new Awakening(price, description, badgeAmount, target_status);
                        allStatusHealings.add(awakening);
                        break;

                    case "Paralyze Heal":
                        price = fileReader.nextFloat();
                        description = fileReader.nextLine();
                        badgeAmount = fileReader.nextInt();
                        target_status = fileReader.nextLine();
                        ParalyzeHeal paralyzeHeal = new ParalyzeHeal(price, description, badgeAmount, target_status);
                        allStatusHealings.add(paralyzeHeal);
                        break;

                    case "Burn Heal":
                        price = fileReader.nextFloat();
                        description = fileReader.nextLine();
                        badgeAmount = fileReader.nextInt();
                        target_status = fileReader.nextLine();
                        BurnHeal burnHeal = new BurnHeal(price, description, badgeAmount, target_status);
                        allStatusHealings.add(burnHeal);
                        break;

                    case "Ice Heal":
                        price = fileReader.nextFloat();
                        description = fileReader.nextLine();
                        badgeAmount = fileReader.nextInt();
                        target_status = fileReader.nextLine();
                        IceHeal iceHeal = new IceHeal(price, description, badgeAmount, target_status);
                        allStatusHealings.add(iceHeal);
                        break;

                    case "Full Heal":
                        price = fileReader.nextFloat();
                        description = fileReader.nextLine();
                        badgeAmount = fileReader.nextInt();
                        target_status = fileReader.nextLine();
                        FullHeal fullHeal = new FullHeal(price, description, badgeAmount, target_status);
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
