package lesson3;

public class Main5 {
    public static void main(String[] args) {
        int[] numbers = {7, 10, 13, -1, 2, -1, 80, 7};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                if (numbers[i] >= 0 && numbers[i + 1] >= 0) {
                    sum = sum + numbers[i];
                }

            }else if (i == numbers.length - 1) {
                if (numbers[i] >= 0 && numbers[i - 1] >= 0) {
                    sum = sum + numbers[i];
                }
            } else {
                if (numbers[i] >= 0 && numbers[i + 1] >= 0 && numbers[i - 1] >= 0) {
                    sum = sum + numbers[i];
                }
            }
        }
        System.out.println(sum);
    }
}
