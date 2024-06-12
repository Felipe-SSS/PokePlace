package br.inatel.almeidafelpo.pokeplace.products.status_healings;
import br.inatel.almeidafelpo.pokeplace.products.Product;

public abstract class StatusHealing extends Product{

    String target_status;
    String name;

    public StatusHealing(float price, String description, int badges, String target_status, String name) {
        super(price, description, badges);
        this.target_status = target_status;
        this.name = name;
    }

    @Override
    public void showInfo(int clientBadges, int index) {
        if ((clientBadges >=this.badges) && (clientBadges <= 8))
        {
            System.out.println(index + " - " + this.name);
            System.out.println(this.description);
            System.out.println("Price: $ " + this.price);
            System.out.println("Neutralized effect: " + this.target_status);
        }
    }

    @Override
    public void addPurchase() {
    }

}
