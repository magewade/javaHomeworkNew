package org.andresen.lab.lesson4.payment;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.addProduct("Milk", 90);
        payment.addProduct("Bread", 50);
        payment.addProduct("Eggs", 85);
        payment.addProduct("Cake", 200);

        payment.showProducts();
    }
}
