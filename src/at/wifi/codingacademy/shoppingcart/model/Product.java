package at.wifi.codingacademy.shoppingcart.model;

public abstract class Product {
    protected String productNumber;
    protected double price;
    protected String name;
    protected int stockItems;

    public Product(String productNumber, double price, String name, int stockItems) {
        this.productNumber = productNumber;
        this.price = price;
        this.name = name;
        this.stockItems = stockItems;
    }

    // Methoden

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStockItems() {
        return stockItems;
    }

    public void setStockItems(int stockItems) {
        this.stockItems = stockItems;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNumber='" + productNumber + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", stockItems=" + stockItems +
                '}';
    }
}
