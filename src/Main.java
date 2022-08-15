public class Main {
    public static void main(String[] args) {

        // Задание2.1
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        // Задание2.2
        double[] someNumbers = {1.57, 7.654, 9.986};
        for (int j = 0; j < someNumbers.length; j++) {
            System.out.print(someNumbers[j]);
            if (j != someNumbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        // Задание2.3
        int[] fruitBox = new int[15];
        fruitBox[0] = 4;
        fruitBox[1] = 9;
        fruitBox[2] = 15;
        for (int k = 0; k < fruitBox.length; k++) {
            System.out.print(fruitBox[k]);
            if (k != fruitBox.length - 1) {
                System.out.print(", ");
            }
        }
    }
}