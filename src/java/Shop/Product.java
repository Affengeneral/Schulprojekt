package Shop;

import java.io.Serializable;
import java.util.Optional;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Product implements Serializable{
    
    // Artikelnummer, Nettopreis, Produktname, Produktbeschreibung, Herstellername, Produktbild im JPG-
    // Format (Pfad zur Bilddatei), Lagerbestand
    
    private int number;
    private String name;
    private String manufacturer;
    private double price;
    private String description;
    private String pictureName;
    private int stock;
    
    public Product(int number, String name, String manufacturer, double price, String description, String picture, int stock) {
        this.number = number;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.description = description;
        this.pictureName = picture;
        this.stock = stock;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass()){
            return false;
        }
        if (((Product) obj).getNumber() == this.number){
            return true;
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.number;
        return hash;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the producer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * @param manufacturer the producer to set
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the picture
     */
    public String getPictureName() {
        return pictureName;
    }

    /**
     * @param pictureName the picture to set
     */
    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }
    
    public int getOrdered(){
        Optional<CartEntry> cartEntry = CartModel.getInstance().getCartEntries().stream().filter((CartEntry entry) -> entry.getProduct().getNumber() == this.number).findFirst();
        if (!cartEntry.isPresent()){
            return 0;
        }
        return cartEntry.get().getCount();
    }
}
