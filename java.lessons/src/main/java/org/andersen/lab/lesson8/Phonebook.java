package org.andersen.lab.lesson8;

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
    private final HashMap<String, ArrayList<String>> elements = new HashMap<>();

    @Override
    public String toString() {
        return "Phone numbers:" +
                " " + elements +
                ' ';
    }

    public void add(String name, String number) {

        ArrayList<String> phones = elements.get(name);
        if (phones != null) {
            phones.add(number);
        } else {
            phones = new ArrayList<>();
            phones.add(number);
            elements.put(name, phones);}
    }

    public String[] get(String name) {
        String message = "Try again";
        try {
            return elements.get(name).toArray(new String[0]);
        }
        catch (NullPointerException e) {
            System.out.println("Can't find name");
        }
        return new String[]{message};
    }
}
