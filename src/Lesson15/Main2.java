package Lesson15;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        Coin coin = new Coin(2.5,1990,2);
        Coin coin1 = new Coin(2,1900,25);
        Coin coin2 = new Coin(3,1992,15);
        Coin coin3 = new Coin(2.7,1997,5);
        Coin coin4 = new Coin(2.5,1990,2);


        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(coin);
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);

        for (Coin c:coins ) {
            System.out.println(c);
        }


    }
}
