package lesson16;

import java.util.Comparator;

public class SortName implements Comparator<Tovar> {
    @Override
    public int compare(Tovar o1, Tovar o2) {
        if (o1.getName().equals(o2.getName())) {
            return o1.getName().compareTo(o2.getName());
        }

        if (o1.getPrice() != o2.getPrice()) {
            return o1.getPrice() - o2.getPrice();
        }
        if (o1.getBuy() != o2.getBuy()) {
            return o1.getBuy() - o2.getBuy();
        }
        if (o1.getRating() != o2.getRating()) {
            return o1.getRating() - o2.getRating();
        }
        if (o1.getView()!=o2.getView()){
            return o1.getView() - o2.getView();
        }
        return o1.getReview()-o2.getReview();
    }
}
