package lesson3;

public class HomeWork_3 {
    public static void main(String[] args) {
        //Задача 3
        int[] numbers = {6, 4, 77, 89, 34, -2, 333, 561, 345, 44};
        for (int i = numbers.length - 1; i >= 0; i--) {
            //    System.out.println(numbers[i]);
        }

        //Задача 5
        int year = 7;
        int money = 10000;
        int percent = 9;

        for (int i = 0; i < year; i++) {
            money = money + (money / 100 * percent);
        }
        // System.out.println(money);

        //Задача 2

        int[] numbers2 = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0;
        for (int i = 0; i < numbers2.length; i++) {
            sum = sum + numbers2[i];
        }
        //System.out.println(sum);

        //Задача 3

        int[] num = {4, 6, 8, 3, 9};
        int[] num2 = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            if (i == 0) {
                num2[num.length - 1] = num[i];
            } else {
                num2[i - 1] = num[i];
            }
        }
        for (int i = 0; i < num2.length; i++) {
            //  System.out.print(num2[i] + ",");
        }

        //Задача 4

        int[] first7 = new int[7];

        for (int i = 0; i < first7.length; i++) {
            for (int j = 1; j > 0; j++) {
                if (j % 4 == 0) {
                    first7[i] = j;
                    i++;
                    if (i == first7.length) {
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < first7.length; i++) {
            //   System.out.print(first7[i] + ",");
        }

        //Задача 5

        int a = 8; // первый знаменатель
        int b = 6; // вотрой знамнатель

        for (int i = 1; i >= 0; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.println(i);
                break;
            }
        }


    }
}
