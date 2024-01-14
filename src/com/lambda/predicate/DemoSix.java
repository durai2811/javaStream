package com.lambda.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DemoSix {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1200.0),
                new Product("Smartphone", 500.0),
                new Product("Headphones", 80.0),
                new Product("Coffee Maker", 150.0),
                new Product("Backpack", 30.0)
        );
double minPrice =100; double maximum =1000;
        Predicate<Product> productPredicate = n -> n.getPrice()>=minPrice && n.getPrice()<=maximum;

        for (Product product:products) {
            if(productPredicate.test(product))
                System.out.println(product);
        }
    }
}

class Product {
    private String productName;
    private double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
