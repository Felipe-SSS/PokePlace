package br.inatel.almeidafelpo.pokeplace.products.pokeballs;

public class TimerBall extends PokeBall{
    public TimerBall(float price, String description, int badges) {
        super(price, description, badges);
    }
    @Override
    public void showInfo(int clientBadges) {
        if ((clientBadges >=4) && (clientBadges <= 8))
        {
            System.out.println("TimerBall");
            System.out.println(this.description);
            System.out.println("Price: $ " + this.price);
        }
    }
}
