package lesson6;

public class SearchTour {
//    public static void printTourByCountry(String country, String[][] tours) {
//        for (int i = 0; i < tours.length; i++) {
//            if (country.equalsIgnoreCase(tours[i][0])) {
//                System.out.println(tours[i][0] + ", цена - " + tours[i][1] + ", " + tours[i][2] + ", " + tours[i][3] + ", " + tours[i][4]);
//            }
//
//        }
//    }
//
//    public static void inputDays(String days, String[][] tours) {
//        for (int i = 0; i < tours.length; i++) {
//            if (days.equalsIgnoreCase(tours[i][2])) {
//                System.out.println(tours[i][0] + ", цена - " + tours[i][1] + ", " + tours[i][2] + ", " + tours[i][3] + ", " + tours[i][4]);
//            }
//        }
//    }
//
//    public static void inputStar(String star, String[][] tours) {
//        for (int i = 0; i < tours.length; i++) {
//            if (star.equalsIgnoreCase(tours[i][3])) {
//                System.out.println(tours[i][0] + ", цена - " + tours[i][1] + ", " + tours[i][2] + ", " + tours[i][3] + ", " + tours[i][4]);
//            }
//        }
//    }
//
//    public static void tourByPriceFrom(String from, String[][] tours) {
//        int priceFromNum = Integer.parseInt(from);
//        for (int i = 0; i < tours.length; i++) {
//            int priceTour = Integer.parseInt(tours[i][1]);
//            if (priceTour > priceFromNum) {
//                System.out.println(tours[i][0] + ", цена - " + tours[i][1] + ", " + tours[i][2] + ", " + tours[i][3] + ", " + tours[i][4]);
//            }
//        }
//    }

    public static void sevenDaysTour(String days, String[][] tours) { //Задача 1
        for (int i = 0; i < tours.length; i++) {
            if (days.equalsIgnoreCase(tours[i][2])) {
                System.out.println(tours[i][0] + ", цена - " + tours[i][1] + ", " + tours[i][2] + ", " + tours[i][3] + ", " + tours[i][4]);
            }
        }
    }
    public static void pansionat(String pansionat, String [][] tours){   //Задача 2
        for (int  i = 0; i<tours.length;i++){
            if (pansionat.equalsIgnoreCase(tours[i][4])){
                System.out.println(tours[i][0] + ", цена - " + tours[i][1] + ", " + tours[i][2] + ", " + tours[i][3] + ", " + tours[i][4]);
            }
        }
    }
    public static void tourByPriceUnder(String from, String[][] tours) {  //Задача 3
        int priceFromNum = Integer.parseInt(from);
        for (int i = 0; i < tours.length; i++) {
            int priceTour = Integer.parseInt(tours[i][1]);
            if (priceTour < priceFromNum) {
                System.out.println(tours[i][0] + ", цена - " + tours[i][1] + ", " + tours[i][2] + ", " + tours[i][3] + ", " + tours[i][4]);
            }
        }
    }
    public static void PriceAll(String[][] tours) {  // Задача 4
        int sum = 0;
        for (int i = 0; i < tours.length; i++) {
            sum = sum + Integer.parseInt(tours[i][1]);
        }
        System.out.println(sum);
    }


}

