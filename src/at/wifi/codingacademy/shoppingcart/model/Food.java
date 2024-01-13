package at.wifi.codingacademy.shoppingcart.model;

import java.util.Date;

public class Food extends Product{
    protected Date bestBeforeDate;
    protected int calories;
    protected FoodCategory category;
    protected boolean isVegetarian;
    protected boolean isVegan;

    public Food(String productNumber, double price, String name, int stockItems, Date bestBeforeDate, int calories,
                FoodCategory category, boolean isVegetarian, boolean isVegan) {
        super(productNumber, price, name, stockItems);
        this.bestBeforeDate = bestBeforeDate;
        this.calories = calories;
        this.category = category;
        this.isVegetarian = isVegetarian;
        this.isVegan = isVegan;
    }

    public Food(String productNumber, double price, String name, int stockItems, Date bestBeforeDate, int calories) {
        super(productNumber, price, name, stockItems);
        this.bestBeforeDate = bestBeforeDate;
        this.calories = calories;
        this.category = FoodCategory.OTHER;
        this.isVegetarian = false;
        this.isVegan = false;
    }

    public Date getBestBeforeDate() {
        return bestBeforeDate;
    }

    public void setBestBeforeDate(Date bestBeforeDate) {
        this.bestBeforeDate = bestBeforeDate;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public FoodCategory getCategory() {
        return category;
    }

    public void setCategory(FoodCategory category) {
        this.category = category;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    @Override
    public String toString() {
        return "Food{" +
                "bestBeforeDate=" + bestBeforeDate +
                ", calories=" + calories +
                ", category=" + category +
                ", isVegetarian=" + isVegetarian +
                ", isVegan=" + isVegan +
                ", productNumber='" + productNumber + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", stockItems=" + stockItems +
                '}';
    }
}
