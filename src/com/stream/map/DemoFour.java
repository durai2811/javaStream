package com.stream.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Task 4: Calculating Discounted Prices for Products
 * Apply the map operation to calculate discounted prices for each product in a list based on a discount percentage.
 */
public class DemoFour {
    public static void main(String[] args) {
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

        productList.stream()
                .map(product -> {
                            Product updatedProduct = new Product(product.getProductId(), product.getProductName(), product.getPrice() * 0.6);
                            return updatedProduct;
                        }
                ).forEach(System.out::println);

    }
}

class Product {
    private String productId;
    private String productName;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

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
