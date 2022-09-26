package org.andresen.lab.lesson4.park;

public class Main {
    public static void main(String[] args) {
        Park payment = new Park();
        payment.addAttraction("The Haunted Mansion", "10.00 - 19.00", 100);
        payment.addAttraction("Jungle Cruise", "10.00 - 21.00", 90);
        payment.addAttraction("Rocket Rods", "10.00 - 18.00", 120);
        payment.addAttraction("Autopia", "10.00 - 19.00", 70);

        payment.showAttractionsInfo();
    }
}
