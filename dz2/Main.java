public class Main {

    public static void main(String[] args) {

        String[][] strings1 = {
                {"123", "3210", "147", "42156"},
                {"123", "3210", "147", "42156"},
                {"123", "3210", "147", "42156"},
                {"123", "3210", "147", "42156"}
        };

        String[][] strings2 = {
                {"1", "1", "1",},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        String[][] strings3 = {
                {"1", "1", "1", "z"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        try {
            System.out.println(sumArray(strings1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(sumArray(strings2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(sumArray(strings3));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    private static int sumArray(String[][] array)
            throws MyArraySizeException, MyArrayDataException {

        System.out.println(array[0].length + "" + array.length);
        if (array.length != 4 || array[0].length != 4) {
            System.out.println("catch");
            throw new MyArraySizeException();
        }
        int sum = 0;
        int rowNumber = 0;
        int columNumber = 0;
        String value = "";
        try {
            for (int row = 0; row < array.length; row++) {
                for (int column = 0; column < array.length; column++) {
                    rowNumber = row;
                    columNumber = column;
                    value = array[row][column];
                    sum += Integer.parseInt(array[row][column]);
                }
            }
        } catch (NumberFormatException e) {
            throw new MyArrayDataException(
                    "В данной ячейке [" + rowNumber + "][" + columNumber + "] значение: " + value + ", не удалось обработать данные!");
        }
        return sum;
    }


    public static class MyArraySizeException extends Exception {
        public MyArraySizeException() {
            super("Неправильная размерность");
        }
    }

    public static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message);
        }
    }
}



