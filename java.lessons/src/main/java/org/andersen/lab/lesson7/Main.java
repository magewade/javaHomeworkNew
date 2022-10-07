package org.andersen.lab.lesson7;

public class Main {
    public static void main(String[] args) {
        AppData appData = new AppData();
        String file = "java.lessons/src/main/java/org/andersen/lab/lesson7/text.csv";

        appData.setHeader(new String[]{"Value 1", "Value 2", "Value 3"});

        appData.setData(new Integer[][]{{100, 200, 123}, {300, 400, 500}});
        appData.save(file);
        appData.load(file);

        appData.setData(new Integer[][]{{200, 300, 232}, {100, 200, 300}});
        appData.save(file);
        appData.load(file);
    }
}
