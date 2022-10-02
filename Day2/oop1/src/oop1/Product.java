package oop1;

public class Product {

    // camelCase
    // name -> class field
    private String name;
    private double unitPrice;
    private double discount;
    private String imageUrl;
    private int unitsStock;

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getUnitsStock() {
        return unitsStock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setUnitsStock(int unitsStock) {
        this.unitsStock = unitsStock;
    }

}
