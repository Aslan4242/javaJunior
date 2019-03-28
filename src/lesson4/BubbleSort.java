package lesson4;

public class BubbleSort {

    public static void main(String[] args) {

        int[] numbers = {7, 16, 5, 9};

        for (int i = 0; i < numbers.length; i++) {
            int a = numbers[i];

            for (int j = i - 1; j >= 0; j--) {
                int left = numbers[j];
                if (a < left) {
                    numbers[j + 1] = left;
                    numbers[j] = a;
                } else {
                    break;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
