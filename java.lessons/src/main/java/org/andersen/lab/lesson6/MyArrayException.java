package lesson6;

public class MyArrayException extends  Exception{
    static int array(String[][] array)
            throws MyArraySizeException, MyArrayDataException {

        int sum = 0;

        if (4 != array.length) throw new MyArraySizeException();
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) throw new MyArraySizeException();
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }
}
