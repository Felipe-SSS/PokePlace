package br.inatel.almeidafelpo.pokeplace.Trainer;

import br.inatel.almeidafelpo.pokeplace.products.Product;

public class Item {

    public Product product;
    public int amount;

    public Item(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
