package Lesson14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        try{
            ArrayList<Integer> num1 = new ArrayList<>();
            num1.add(null);
            num1.add(2);
            num1.add(3);
            num1.add(5);

            HashSet<Integer> num2 = new HashSet<>();
            num2.add(1);
            num2.add(6);
            num2.add(null);
            num2.add(3);


            CollectionUtilsImpl utils = new CollectionUtilsImpl();

            Collection<Integer> result = utils.union(num1, num2);
            System.out.println(result);

            Collection<Integer> result1 = utils.intersection(num1, num2);
            System.out.println(result1);

            Set<Integer> result2 = utils.unionWithoutDuplicate(num1, num2);
            System.out.println(result2);

            Set<Integer> result3 = utils.intersectionWithoutDuplicate(num1, num2);
            System.out.println(result3);

            Collection<Integer> result4 = utils.difference(num1, num2);
            System.out.println(result4);
        }catch (NullPointerException e){
            System.out.println("Ошибка. Null");
        }







    }
}
