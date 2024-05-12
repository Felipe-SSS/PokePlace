package br.inatel.almeidafelpo.pokeplace.products.pokeballs;

public class UltraBall extends PokeBall{

    public UltraBall(float price, String description, int badges) {
        super(price, description, badges);
    }

    @Override
    public void showInfo(int clientBadges) {
        if ((clientBadges >=3) && (clientBadges <= 8))
        {
            System.out.println("UltraBall");
            System.out.println(this.description);
            System.out.println("Price: $ " + this.price);
        }
    }
}
