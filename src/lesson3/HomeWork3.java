package lesson3;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("Start");
        for (int i = 10; i <= 30; i++) {
            if (i > 20 && i < 25) {
                continue;
            }
            System.out.println(i);
        }
    }
}
