package Lesson15.HM;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try{
            ListUtilsImpl listUtils = new ListUtilsImpl();
            List<String> list = listUtils.asList("Akks", "bob", "Ccc");
            System.out.println(list);

            ArrayList<Double> arrayList = new ArrayList<>();
            arrayList.add(0.5);
            arrayList.add(1.5);
            arrayList.add(1.0);
            List<Double> resultSort = listUtils.sortedList(arrayList);
            System.out.println(resultSort);


            SetUtilsImpl setUtils = new SetUtilsImpl();
            Collection<Integer> integers = new ArrayList<>(null);
            integers.add(10);
            integers.add(20);
            integers.add(100);
            Set<String> strings = new HashSet<>(null);
            strings.add("zza");
            strings.add("bbb");
            strings.add("aaa");
            SortedSet<String> s = setUtils.orderedSet(integers, strings);
            System.out.println(s);

            Set<Integer> integers1 = setUtils.customOrderSet(1, 6, 3, 4, 5);

            System.out.println(integers1);
        }catch (IllegalArgumentException e ){
            System.out.println("Ошибка" + e.toString());
        }catch (NullPointerException e){
            System.out.println("Ошибка нулл " + e.toString());
        }


    }
}
