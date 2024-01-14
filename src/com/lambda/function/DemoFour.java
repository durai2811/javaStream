package com.lambda.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Task 4: Discount Function for Products
 * Define a Function that applies a discount to the price of a product.
 * Use this function to calculate the discounted price for each product in a list.
 */

public class DemoFour {
    public static void main(String[] args) {
        List<Product> listP =new ArrayList<>();
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("001", "Laptop", 999.99));
        productList.add(new Product("002", "Smartphone", 499.99));
        productList.add(new Product("003", "Headphones", 79.99));
        productList.add(new Product("004", "Smartwatch", 149.99));
        productList.add(new Product("005", "Camera", 799.99));
        productList.add(new Product("006", "Tablet", 299.99));
        productList.add(new Product("007", "Gaming Console", 399.99));
        productList.add(new Product("008", "Fitness Tracker", 59.99));
        productList.add(new Product("009", "Portable Speaker", 89.99));
        productList.add(new Product("010", "External Hard Drive", 129.99));
        double discountPercent = 40;
        double value = 150;
        Function<Product, Double> discount = (n) -> n.getPrice() - (n.getPrice() * (discountPercent /  100));
        Predicate<Double> discountCondition = n -> n > value;
        for(Product product:productList){
            if(discountCondition.test(product.getPrice())){
                Double apply = discount.apply(product);
                product.setPrice(apply);
                listP.add(product);
            }
        }
        System.out.println(listP);
    }
}

class Product {
    private final String productId;
    private final String productName;
    private double price;

    public Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}