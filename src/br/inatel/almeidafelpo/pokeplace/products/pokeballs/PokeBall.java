package br.inatel.almeidafelpo.pokeplace.products.pokeballs;

import br.inatel.almeidafelpo.pokeplace.products.Product;

public class PokeBall extends Product {

    String name;
    public PokeBall(float price, String description, int badges, String name) {
        super(price, description, badges );
        this.name= name;
    }
    @Override
    public void showInfo(int clientBadges, int index) {
        if ((clientBadges >= this.badges) && (clientBadges <= 8))
        {
            System.out.println(index + " - " + this.name);
            System.out.println(this.description);
            System.out.println("Price: $ " + this.price);
        }
    }

    @Override
    public void addPurchase() {
    }
}
