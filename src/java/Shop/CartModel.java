/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alex
 */
package Shop;

import java.util.ArrayList;
import java.util.Optional;

public class CartModel {

    private ArrayList<CartEntry> cartEntries;
    private static CartModel instance;

    private CartModel() {
        cartEntries = new ArrayList<>();
    }

    public static CartModel getInstance() {
        if (instance == null) {
            instance = new CartModel();
        }
        return instance;
    }

    public void AddCartEntry(Product product, int count) throws Exception {
        if (count < 1) {
            throw new Exception();
        }

        if (getCartEntries().stream().noneMatch((CartEntry entry) -> entry.getProduct().equals(product))) {
            getCartEntries().add(new CartEntry(getCartEntries().size(), product, count));
        } else {
            getCartEntries().stream().filter((cartEntry) -> (cartEntry.getProduct().equals(product))).forEach((cartEntry) -> {
                cartEntry.setCount(cartEntry.getCount() + 1);
            });
        }
    }

    public double getSum() {
        double sum = 0;
        for (CartEntry cartEntry : getCartEntries()) {
            sum = sum + cartEntry.getSum();
        }
        return sum;
    }

    /**
     * @return the cartEntries
     */
    public ArrayList<CartEntry> getCartEntries() {
        return cartEntries;
    }

    /**
     * @param cartEntries the cartEntries to set
     */
    public void setCartEntries(ArrayList<CartEntry> cartEntries) {
        this.cartEntries = cartEntries;
    }

    public CartEntry getEntryById(int id) {
        Optional<CartEntry> findFirst = this.cartEntries.stream().filter(entry -> entry.getId() == id).findFirst();
        return findFirst.isPresent() ? findFirst.get() : null;
    }
}
