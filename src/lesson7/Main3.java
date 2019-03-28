package lesson7;

public class Main3 {
    public static void main(String[] args) {
        String massage = "ab? c,d!";
        int a = StringUtils.countSoglasnie(massage);// Задача 1;
        System.out.println(a);

        String rev = StringUtils.reverse(massage);//Задача 2
        System.out.println(rev);

        String s = StringUtils.deleteZnakiPrepinania(massage);//Задача 3
        System.out.println(s);
    }
}
