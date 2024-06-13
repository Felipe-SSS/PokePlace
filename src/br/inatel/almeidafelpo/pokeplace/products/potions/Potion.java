package br.inatel.almeidafelpo.pokeplace.products.potions;

import br.inatel.almeidafelpo.pokeplace.products.Product;

public class Potion extends Product {

    float heal_amount;

    public Potion(float price, String description, int badges, float heal_amount, String name) {
        super(price, description, badges, name);
        this.heal_amount = heal_amount;
    }

    @Override
    public void showInfo(int clientBadges, int index) {
        if ((clientBadges >=this.badges) && (clientBadges <= 8))
        {
            System.out.println(index + " - " +  this.name);
            System.out.println(this.description);
            System.out.println("Price: $ " + this.price);
            System.out.println("Heal Amount: " + this.heal_amount + " PS");
        }
        else{
            System.out.println(index + " - NOT ENOUGH BADGES YET!");
            System.out.println("??????????");
            System.out.println("Price: $ ????");
            System.out.println("Heal Amount: ?????");
            System.out.println("Ammount of badges necessary: " + this.badges);
        }

    }
}
