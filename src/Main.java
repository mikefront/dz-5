public class Main {
    public static void main(String[] args) {

        // Задание 4
        int[] numbers = {1, 2, 3};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                numbers[i] ++;
            }
            System.out.print(numbers[i]);
            if (i != numbers.length -1) {
                System.out.print(",");
            }
        }
    }
}