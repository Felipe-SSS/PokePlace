package br.inatel.almeidafelpo.pokeplace.products.misc;

import br.inatel.almeidafelpo.pokeplace.Trainer.PokeTrainer;
import br.inatel.almeidafelpo.pokeplace.products.Product;

public abstract class Misc extends Product {

    public Misc(float price, String description, int badges, String name) {
        super(price, description, badges, name);
    }

    @Override
    public void showInfo(int clientBadges, int index) {
        if ((clientBadges >=this.badges) && (clientBadges <= 8))
        {
            System.out.println(index + " - " + this.name);
            System.out.println(this.description);
            System.out.println("Price: $ " + this.price);
        }
        else{
            System.out.println(index + " - NOT ENOUGH BADGES YET!");
            System.out.println("??????????");
            System.out.println("Price: $ ????");
            System.out.println("Ammount of badges necessary: " + this.badges);
        }
    }
}
