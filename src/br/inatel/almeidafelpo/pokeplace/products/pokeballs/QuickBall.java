package br.inatel.almeidafelpo.pokeplace.products.pokeballs;

public class QuickBall extends PokeBall{

    public QuickBall(float price, String description, int badges) {
        super(price, description, badges);
    }

    @Override
    public void showInfo(int clientBadges) {
        if ((clientBadges >=4) && (clientBadges <= 8))
        {
            System.out.println("QuickBall");
            System.out.println(this.description);
            System.out.println("Price: $ " + this.price);
        }

    }
}
