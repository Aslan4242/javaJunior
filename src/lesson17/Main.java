package lesson17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> refrigirator = new HashMap<>();
        refrigirator.put("Apple", 2);
        refrigirator.put("Peach", 3);
        refrigirator.put("Orange", 4);
        refrigirator.put("Grape", 5);
        refrigirator.put("Banana",7);
        refrigirator.put("Apple", 3);
        System.out.println(refrigirator);



        Set<String>nameProduct = refrigirator.keySet();
        for (String s: nameProduct) {
            System.out.println(s);
        }
    }
}
