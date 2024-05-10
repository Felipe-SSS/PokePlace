package br.inatel.almeidafelpo.pokeplace;

import br.inatel.almeidafelpo.pokeplace.products.pokeballs.PokeBall;
import br.inatel.almeidafelpo.pokeplace.products.potions.Potion;
import br.inatel.almeidafelpo.pokeplace.products.status_healings.StatusHealing;

import java.util.HashSet;

public class PokeShop {

    private static void refreshStore(){

        HashSet<PokeBall> pokeBalls = new HashSet<>();
        HashSet<Potion> potions = new HashSet<>();
        HashSet<StatusHealing> statusHealings = new HashSet<>();

        pokeBalls = ReadFiles.getRegisteredPokeballs();
        potions = ReadFiles.getRegisteredPotions();
        statusHealings = ReadFiles.getRegisteredStatusHealings();

    }
}