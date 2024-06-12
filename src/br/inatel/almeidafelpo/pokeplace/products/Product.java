package br.inatel.almeidafelpo.pokeplace.products;

public abstract class Product {

    protected float price;
    protected String description;
    protected int badges;
    public int clientBadges;


    public Product(float price, String description, int badges) {
        this.price = price;
        this.description = description;
        this.badges = badges;
    }

    protected Product() {
    }

    public abstract void showInfo(int clientBadges, int index);

    public abstract void addPurchase();
}
