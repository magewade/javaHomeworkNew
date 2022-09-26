package org.andresen.lab.lesson4.park;

import java.util.Arrays;

public class Park {
    Attraction[] attractions = new Attraction[4];
//    Уверена, что тут можно не через массив, а как-то по-нормальному сделать, но пока не знаю как
    int counter;

    public Park() {
    }

    public void showAttractionsInfo() {
        System.out.println(Arrays.toString(attractions));
    }

    public void addAttraction(String name, String time, int price) {
        attractions[counter] = new Attraction(name, time, price);
        counter++;
    }

    private class Attraction {
        private final String name;
        private final String time;
        private final int price;

        public Attraction(String name, String time, int price) {
            this.name = name;
            this.time = time;
            this.price = price;
        }


        @Override
        public String toString() {
            return "Attraction: " +
                    "{name: " + name +
                    ", working time: " + time +
                    ", price: " + price +
                    '}';
        }
    }
}
