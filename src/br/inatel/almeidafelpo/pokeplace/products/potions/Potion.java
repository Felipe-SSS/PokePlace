package br.inatel.almeidafelpo.pokeplace.products.potions;

import br.inatel.almeidafelpo.pokeplace.products.Product;

public class Potion extends Product {

    float heal_amount;

    public Potion(float price, String description, int badges, float heal_amount) {
        super(price, description, badges);
        this.heal_amount = heal_amount;
    }

    @Override
    public void showInfo() {

    }

    @Override
    public void addPurchase() {

    }
}
