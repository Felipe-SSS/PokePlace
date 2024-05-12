package br.inatel.almeidafelpo.pokeplace.products.pokeballs;

import java.util.Scanner;

public class GreatBall extends PokeBall{

    private Scanner input= new Scanner(System.in);
    public GreatBall(float price, String description, int badges) {
        super(price, description, badges);
    }

    @Override
    public void showInfo(int clientBadges) {
        if ((clientBadges >=2) && (clientBadges <= 8))
        {
            System.out.println("GreatBall");
            System.out.println(this.description);
            System.out.println("Price: $ " + this.price);
        }
    }
}
