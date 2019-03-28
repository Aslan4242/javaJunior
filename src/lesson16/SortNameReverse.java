package lesson16;

import java.util.Comparator;

public class SortNameReverse implements Comparator<Tovar> {
    @Override
    public int compare(Tovar o1, Tovar o2) {
        if (o1.getName().equals(o2.getName())) {
            return o2.getName().compareTo(o1.getName());
        }
        if (o1.getPrice() != o2.getPrice()) {
            return o2.getPrice() - o1.getPrice();
        }
        if (o1.getBuy() != o2.getBuy()) {
            return o2.getBuy() - o1.getBuy();
        }
        if (o1.getRating() != o2.getRating()) {
            return o2.getRating() - o1.getRating();
        }
        if (o1.getView()!=o2.getView()){
            return o2.getView() - o1.getView();
        }
        return o2.getReview()-o1.getReview();
    }
}
