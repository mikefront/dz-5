public class Main {
    public static void main(String[] args) {

        // Задание3.1
        int[] numbers = {1, 2, 3};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        // Задание3.2
        double[] someNumbers = {1.57, 7.654, 9.986};
        for (int j = someNumbers.length-1 ; j >= 0; j--) {
            System.out.print(someNumbers[j]);
            if (j != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        // Задание3.3
        int[] fruitBox = {4, 9, 15};
        for (int k = fruitBox.length - 1; k >= 0; k--) {
            System.out.print(fruitBox[k]);
            if (k != 0) {
                System.out.print(",");
            }
        }
    }
}