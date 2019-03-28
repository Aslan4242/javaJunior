package lesson6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Добрый день. Как Вас зовут?");
        String inputName = scn.nextLine();
        System.out.println("Privet, "+ inputName);
        System.out.println("Как дела?");
        String inputKakDela = scn.nextLine();
        if(inputKakDela.equalsIgnoreCase("Horosho")){
            System.out.println("Otlichno");
        }else {
            System.out.println("Pofig");
        }

    }
}
