package lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        //Задача 1а
        for (int i = 0; i >= -20; i--) {
            //     System.out.println(i);
        }

        //Задача 1б
        for (int i = 500; i <= 1000; i++) {
            if (i % 7 == 0 && i % 19 == 0) {
                //    System.out.println(i);
            }
        }

        //Задача 1в
        int sum = 0;
        for (int i = 50; i <= 1000; i++) {
            if (i % 7 == 0 && i % 19 == 0) {
                sum = sum + i;
            }
        }
        //  System.out.println(sum);

        //Задача 1г
        System.out.println("Start");
        for (int i = 10; i <= 30; i++) {
            if (i > 20 && i < 25) {
                  continue;
            }
            System.out.println(i);
        }

        //Задача 1д

        for (int i = 100; i >= 90; i--) {
            //   System.out.println(i);
        }



    }
}
