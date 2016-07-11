/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

/**
 *
 * @author Alex
 */
public class CartEntry {
    private int id;
    private Product product;
    private int count;
    private double sum;

    public CartEntry(int id, Product product, int count) {
        this.id = id;
        this.product = product;
        this.count = count;
        this.sum = product.getPrice() * count;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
        sum = this.product.getPrice() * this.count;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
        this.sum = this.count * this.product.getPrice();
    }
    
    public double getSum(){
        return sum;
    }
}
