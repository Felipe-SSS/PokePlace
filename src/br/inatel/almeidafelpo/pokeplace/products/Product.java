package br.inatel.almeidafelpo.pokeplace.products;

public abstract class Product {

    float price;
    String description;
    int badges;

    public Product(float price, String description, int badges) {
        this.price = price;
        this.description = description;
        this.badges = badges;
    }

    public abstract void showInfo();

    public abstract void addPurchase();
}
