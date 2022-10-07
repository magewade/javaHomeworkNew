package lesson6;

public class MyArraySizeException extends Exception {
    MyArraySizeException() {
        super("Array size must be 4x4\n");
    }
}
