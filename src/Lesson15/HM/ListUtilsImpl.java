package Lesson15.HM;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class ListUtilsImpl implements ListUtils {

    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        for (String s:strings) {
            if (s==null){
                throw new  IllegalArgumentException();
            }
        }
        List<String> result = new ArrayList<>();
        for (String s : strings) {
            result.add(s);
        }
        return result;
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        if (data==null){
            throw new IllegalArgumentException();
        }
        TreeSet<Double> res = new TreeSet<>();
        res.addAll(data);

        ArrayList<Double> currentResult = new ArrayList<>();
        currentResult.addAll(res);

        ArrayList<Double> result1 = new ArrayList<>();
        for (int i = currentResult.size() - 1; i >= 0; i--) {
            result1.add(currentResult.get(i));
        }

        return result1;
    }
}
