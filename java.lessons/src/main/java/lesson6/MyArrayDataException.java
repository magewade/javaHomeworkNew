package lesson6;

public class MyArrayDataException extends Exception {
    MyArrayDataException(int i, int j) {
        super(String.format("Wrong format in " + "[" + i + "," + j + "]" + "\n"));
    }
}
