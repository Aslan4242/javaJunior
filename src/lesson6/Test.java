package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 9, 5};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        for (int element : a) {
            //System.out.println(element);
        }
        //System.out.println(Arrays.toString(a));

        int [] b = Arrays.copyOf(a,3);
        //System.out.println(Arrays.toString(b));
        int x=9;
        int y = 10;
        int s = x<y?x:y;
        //System.out.println(s);
    }
}
