package Lesson15.HM;

import java.util.*;

public class SetUtilsImpl implements SetUtils {
    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException {
        if (collection1.equals(null) || set2.equals(null)){

        }
        TreeSet<String> res = new TreeSet<>();
        for (Integer e : collection1) {
            res.add(Integer.toString(e));
        }
        res.addAll(set2);

        SortedSet<String> result = res.descendingSet();

        return result;

    }

    @Override
    public Set<Integer> customOrderSet(int val1, int val2, int val3, int val4, int val5) {
        LinkedHashSet<Integer> result = new LinkedHashSet<>();
        result.add(val1);
        result.add(val2);
        result.add(val3);
        result.add(val4);
        result.add(val5);

        return result;
    }


}
