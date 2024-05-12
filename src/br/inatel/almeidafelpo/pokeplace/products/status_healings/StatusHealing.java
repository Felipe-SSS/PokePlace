package br.inatel.almeidafelpo.pokeplace.products.status_healings;
import br.inatel.almeidafelpo.pokeplace.products.Product;

public class StatusHealing extends Product{

    String target_status;

    public StatusHealing(float price, String description, int badges, String target_status) {
        super(price, description, badges);
        this.target_status = target_status;
    }

    @Override
    public void showInfo(int clientBadges) {
    }

    @Override
    public void addPurchase() {
    }

}
