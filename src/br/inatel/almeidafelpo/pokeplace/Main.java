package br.inatel.almeidafelpo.pokeplace;

import br.inatel.almeidafelpo.pokeplace.Trainer.PokeTrainer;
import br.inatel.almeidafelpo.pokeplace.colored.Colored;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        PokeTrainer pokeTrainer = new PokeTrainer();

        pokeTrainer.badges();

        Colored colored = new Colored();

        PokeStore pokeStore = new PokeStore();

        pokeStore.showCatalogue(pokeTrainer);

    }

}
