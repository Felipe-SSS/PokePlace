package br.inatel.almeidafelpo.pokeplace.Trainer;

import br.inatel.almeidafelpo.pokeplace.products.misc.Misc;
import br.inatel.almeidafelpo.pokeplace.products.pokeballs.PokeBall;
import br.inatel.almeidafelpo.pokeplace.products.potions.Potion;
import br.inatel.almeidafelpo.pokeplace.products.status_healings.StatusHealing;

import java.util.HashSet;

public class PokeBag {

    public HashSet<PokeBall> pokeBalls = new HashSet<>();
    public HashSet<Potion> potions = new HashSet<>();
    public HashSet<StatusHealing> statusHealings = new HashSet<>();
    public HashSet<Misc> miscs = new HashSet<>();

}
