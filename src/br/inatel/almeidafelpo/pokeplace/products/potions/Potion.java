package br.inatel.almeidafelpo.pokeplace.products.potions;

import br.inatel.almeidafelpo.pokeplace.products.Product;

public class Potion extends Product {

    float heal_amount;
    String name;

    public Potion(float price, String description, int badges, float heal_amount, String name) {
        super(price, description, badges);
        this.heal_amount = heal_amount;
        this.name = name;
    }
    @Override
    public void showInfo(int clientBadges) {
        if ((clientBadges >=this.badges) && (clientBadges <= 8))
        {
            System.out.println(this.name);
            System.out.println(this.description);
            System.out.println("Price: $ " + this.price);
            System.out.println("Heal Amount: " + this.heal_amount + " PS");
        }
    }
    @Override
    public void addPurchase() {

    }
}
