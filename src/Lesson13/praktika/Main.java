package Lesson13.praktika;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите название страны:");

        Scanner scn = new Scanner(System.in);
        String inputCountry = scn.nextLine();
        AbstractCountry country = null;
        if (inputCountry.equals("Германия")){
            country = new Germany();
            country.setCountKurort(234);
            country.setSquare(3435353);
            country.setCapital("Берлин");
            country.setNaselenie(33333);
            country.setVisa(true);
        }
        if (inputCountry.equals("Италия")){
            country = new Italy();
            country.setCountKurort(124);
            country.setSquare(7979797);
            country.setCapital("Рим");
            country.setNaselenie(5555);
            country.setVisa(false);
        }
        System.out.println("Что вы хотите узнать?");
        System.out.println("1- население");
        System.out.println("2-площадь");
        System.out.println("3-столица");
        System.out.println("4-количество курортов");
        System.out.println("5- нужна ли виза");

        int inputAction = scn.nextInt();

        switch (inputAction){
            case 1:
                country.printPeople();
                break;
            case 2:
                country.printSquare();
                break;
            case 3:
                System.out.println(country.getCapital());
                break;
            case 4:
                country.printKurorty();
                break;
            case 5:
                System.out.println(country.isVisa());
                break;
                default:
                    System.out.println("неправильно");


        }
    }
}
