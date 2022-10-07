package org.andersen.lab.lesson4.payment;

import java.util.Arrays;

public class Payment {
    Product[] products = new Product[4];
    //    Уверена, что тут можно не через массив, а как-то по-нормальному сделать, но пока не знаю как
    int counter;

    public Payment() {
    }

    public void showProducts() {
        System.out.println(Arrays.toString(products));
    }

    public void addProduct(String name, double price) {
        products[counter] = new Product(name, price);
        counter++;
    }

    private class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }


        @Override
        public String toString() {
            return "Product: " +
                    "{name: " + name +
                    ", price: " + price + "}";
        }
    }
}
