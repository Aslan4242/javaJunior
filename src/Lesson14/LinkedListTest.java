package Lesson14;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> collections = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            collections.add("ggg"+i);
        }
        long endtTime = System.currentTimeMillis();
        System.out.println(endtTime-startTime);

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            collections.get(i);
        }
        long endtTime2 = System.currentTimeMillis();
        System.out.println(endtTime2-startTime2);
    }
}
