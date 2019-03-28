package Lesson14;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a==null && b==null){
          throw new NullPointerException();
        }
            ArrayList<Integer> result = new ArrayList<>();
            for (Integer num : a) {
                result.add(num);
            }
            result.addAll(b);
            return result;


    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a==null && b==null){
            throw new NullPointerException ();
        }
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> arrayA = new ArrayList<>();
        arrayA.addAll(a);
        ArrayList<Integer> arrayB = new ArrayList<>();
        arrayB.addAll(b);
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                    if (arrayA.get(i).equals(arrayB.get(j))) {
                        result.add(arrayA.get(i));
                        result.add(arrayB.get(j));
                    }
            }
        }

        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a==null || b==null){
            throw new NullPointerException ();
        }
        Set<Integer> result = new HashSet<>();
        for (Integer num : a) {
            result.add(num);
        }
        result.addAll(b);
        return result;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a==null || b==null){
            throw new NullPointerException ();
        }
        Set<Integer> result1 = new HashSet<>();
        ArrayList<Integer> arrayA = new ArrayList<>();
        arrayA.addAll(a);
        ArrayList<Integer> arrayB = new ArrayList<>();
        arrayB.addAll(b);
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                    if (arrayA.get(i).equals(arrayB.get(j))) {
                        result1.add(arrayA.get(i));
                        result1.add(arrayB.get(j));

                    }
            }
        }
        return result1;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a==null || b==null){
            throw new NullPointerException ();
        }
        Collection<Integer> result1 = new HashSet<>();
        result1.addAll(a);

        ArrayList<Integer> arrayB = new ArrayList<>();
        arrayB.addAll(b);
        for (int i = 0; i < arrayB.size(); i++) {
            if (result1.contains(arrayB.get(i))) {
                result1.remove(arrayB.get(i));
            } else {
                result1.add(arrayB.get(i));
            }
        }
        return result1;
    }
}
