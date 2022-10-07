package org.andersen.lab.lesson8;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Words {
    public static void getUnique(List<String> words) {
        System.out.println(words.toString());
        Set<String> unique = new HashSet<>(words);
        System.out.println(unique);
        System.out.println("Words: ");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
