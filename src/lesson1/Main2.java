package lesson1;

public class Main2 {
    public static void main(String[] args) {
        int sum = 1000;
        int priceToy = 175;
        int priceGum = 11;
        int priceCandy = 2;

        int toys = sum/priceToy;
        int left =sum - priceToy*toys;

        int gum = left/priceGum;
        int left2 = left - priceGum*gum;

        int candy = left2/priceCandy;
        int left3 = left2 - priceCandy*candy;


        System.out.println(toys);
        System.out.println(gum);
        System.out.println(candy);
        System.out.println(left3);
    }
}
