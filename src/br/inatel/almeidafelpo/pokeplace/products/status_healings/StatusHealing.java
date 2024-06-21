package br.inatel.almeidafelpo.pokeplace.products.status_healings;
import br.inatel.almeidafelpo.pokeplace.products.Product;

public abstract class StatusHealing extends Product{

    String target_status;

    public StatusHealing(float price, String description, int badges, String target_status, String name) {
        super(price, description, badges, name);
        this.target_status = target_status;
    }

    @Override
    public void showInfo(int clientBadges, int index, boolean pokeBag) {

        if (pokeBag){
            System.out.println(index + " - " +  this.name);
            System.out.println(this.description);
            System.out.println("Neutralized effect: " + this.target_status);
        }
        else{
            if ((clientBadges >=this.badges) && (clientBadges <= 8))
            {
                System.out.println(index + " - " +  this.name);
                System.out.println(this.description);
                System.out.println("Price: $ " + this.price);
                System.out.println("Neutralized effect: " + this.target_status);
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

}
