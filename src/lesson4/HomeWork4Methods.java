package lesson4;

public class HomeWork4Methods {

    // метод для задачи 1
    public static void minimum(int a, int b, int c, int d) {
        int min1 = 0;
        int min2 = 0;
        int min = 0;
        if (a < b) {
            min1 = a;
        } else {
            min1 = b;
        }
        if (c < d) {
            min2 = c;
        } else {
            min2 = d;
        }
        if (min1 < min2) {
            min = min1;
        } else {
            min = min2;
        }
        System.out.println(min);
    }

    // метод для задачи 2
    public static void kolichestvo(int count, int print) {
        for (int i = 0; i < count; i++) {
            System.out.println(print);
        }
    }

    // метод для задачи 3
    public static void chetno(int[] massiv) {
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 2 == 0) {
                System.out.println(massiv[i]);
            }
        }
    }

    //метод для задачи 4
    public static void simbols(char[] charMassiv) {
        for (int i = 0; i < charMassiv.length; i++) {
            if (i % 2 == 0) {
                System.out.println(charMassiv[i]);
            }
        }
    }
}
