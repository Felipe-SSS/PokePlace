package br.inatel.almeidafelpo.pokeplace.products;

public class Product {

    protected float price;
    protected String description;
    protected int badges;
    protected String name;

    public Product(float price, String description, int badges, String name) {
        this.price = price;
        this.description = description;
        this.badges = badges;
        this.name = name;
    }

    public void showInfo(int clientBadges, int index, boolean pokeBag){

    }

    public int getBadges() {
        return badges;
    }

    public String getName() {
        return name;
    }
}
