package org.andersen.lab.lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("addiction", "confidence", "district", "honestly", "circumstance", "kindness", "justice", "suggestion", "devotion", "rebel", "influence", "sway", "violence", "youth", "adolescence", "fortune", "disappointment");

        List<String> randomWords = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            randomWords.add(i, words.get(random.nextInt(words.size())));
        }
        Words.getUnique(randomWords);

        System.out.println();

        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", "89000000000");
        phonebook.add("Petrov", "89001111111");
        phonebook.add("Smirnov", "89002222222");
        phonebook.add("Ivanov", "89003333333");
        phonebook.add("Lebedev", "89004444444");

        System.out.println(phonebook);
        System.out.println(Arrays.toString(phonebook.get("Ivanov")));
    }
}

