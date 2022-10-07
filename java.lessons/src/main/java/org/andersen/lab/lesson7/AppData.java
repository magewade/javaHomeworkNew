package org.andersen.lab.lesson7;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class AppData {
    private String[] header;
    private Integer[][] data;

    public AppData() {
    }

    public void save(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(rowToString(header));
            for (Integer[] row : data) {
                writer.write(rowToString(row));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load(String fileName) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            header = bufferedReader.readLine().split(";");
            ArrayList<Integer[]> dataList = new ArrayList<>();
            String tempString;
            while ((tempString = bufferedReader.readLine()) != null) {
                dataList.add(stringToDataRow(tempString));
            }
            data = dataList.toArray(new Integer[][]{{}});
            System.out.println(Arrays.toString(header));
            System.out.println(Arrays.deepToString(data));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private Integer[] stringToDataRow(String str) {
        String[] strings = str.split(";");
        Integer[] integers = new Integer[strings.length];
        for (int i = 0; i < strings.length; i++) {
            integers[i] = Integer.parseInt(strings[i]);
        }
        return integers;
    }

    private <T> String rowToString(T[] row) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < row.length; i++) {
            result.append(row[i].toString());
            if (i != row.length - 1) {
                result.append(";");
            }
        }
        result.append("\n");
        return result.toString();
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public void setData(Integer[][] data) {
        this.data = data;
    }
}
