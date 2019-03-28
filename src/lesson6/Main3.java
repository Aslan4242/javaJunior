package lesson6;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        String[][] tours = {{"Греция", "15000", "7 дней", "5 звезд", "все включено"},
                {"Франция", "17000", "6 дней", "4 звезды", "все включено"},
                {"Греция", "35000", "12 дней", "5 звезд", "все включено"},
                {"Италия", "95000", "17 дней", "5 звезд", "пансионат"},
                {"Греция", "15000", "9 дней", "3 звезды", "пансионат"},
                {"Греция", "45000", "7 дней", "3 звезды", "все включено"}};

        //String inputCountry = scn.nextLine();
        //SearchTour.printTourByCountry(inputCountry,tours);
        //String inputDays = scn.nextLine();
        // SearchTour.inputDays(inputDays, tours);
        //System.out.println("введите цену от тура: " + "");
        //String price = scn.nextLine();
        //SearchTour.tourByPriceFrom(price,tours);
        System.out.println("Сколько дней?");   //Задача 1
        Scanner scn = new Scanner(System.in);
        String days = scn.nextLine();
        SearchTour.sevenDaysTour(days, tours);

        System.out.println("Какой тип?");    // Задача 2
        String pansionat = scn.nextLine();
        SearchTour.pansionat(pansionat, tours);

        System.out.println("Цена?");    // Задача 3
        String price = scn.nextLine();
        SearchTour.tourByPriceUnder(price, tours);

        SearchTour.PriceAll(tours);  //Задача 4

    }
}
