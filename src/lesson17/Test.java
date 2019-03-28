package lesson17;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        int hash = 0;
        String s = "D";
        for (int i = 0; i <s.length() ; i++) {
            hash = 31*hash+s.charAt(i);
        }
        System.out.println(hash);

        HashSet<String> list = new HashSet<>();

        list.add("A");
        list.add("B");
        list.add("Z");
        list.add("C");
//        list.add("D");
        for (String d:list) {
            int hash1 = 0;
            for (int i = 0; i <d.length() ; i++) {
                hash1 += 31*hash1+d.charAt(i);
            }
            System.out.println(d+ " "+ hash1);
        }
        System.out.println(list);

        Set<String> collection = new HashSet<String>(2000);
        String[] data = {"a", "c", "g", "f", "b", "f", "b", "d","q","r","d","m"};
        for(String input: data)
        {
            collection.add(input);
        }
        System.out.println("Output: " + collection);


        HashSet<String> refrigirator = new HashSet<>();
        refrigirator.add("a");
        refrigirator.add("B");
        refrigirator.add("C");
        refrigirator.add("E");
        refrigirator.add("D");
       // System.out.println(refrigirator);


    }
}
