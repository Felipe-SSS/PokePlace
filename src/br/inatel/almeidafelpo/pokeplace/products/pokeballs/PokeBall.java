package br.inatel.almeidafelpo.pokeplace.products.pokeballs;

import br.inatel.almeidafelpo.pokeplace.products.Product;

public class PokeBall extends Product {
    public PokeBall(float price, String description, int badges) {
        super(price, description, badges);
    }
    @Override
    public void showInfo(int clientBadges) {
        System.out.println("Pokeball");
        System.out.println(this.description);
        System.out.println("Price: $ " + this.price);
    }

    @Override
    public void addPurchase() {

    }
}
