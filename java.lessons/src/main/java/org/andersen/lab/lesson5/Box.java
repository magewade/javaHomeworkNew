package org.andersen.lab.lesson5;

import java.util.List;
import java.util.ArrayList;

public class Box<T extends Fruit> {
    public List<T> getList() {
        return list;
    }

    private final List<T> list;


    public Box() {
        list = new ArrayList<>();
    }

    void add(T obj) {
        list.add(obj);
    }

    void moveAtBox(Box<T> box) {
        box.getList().addAll(list);
        list.clear();
    }

    void showBox() {
        if (list.isEmpty()) {
            System.out.println("Box is empty");
        } else {
            System.out.println("In the box: "  + list.size() + " " + list.get(0).toString());
        }
    }

    float getWeight() {
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.size() * list.get(0).getWeight();
        }
    }
    boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

}
