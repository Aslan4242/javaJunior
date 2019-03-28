package lesson16;

import java.util.Comparator;

public class SortView implements Comparator<Tovar> {
    @Override
    public int compare(Tovar o1, Tovar o2) {
        if (o1.getView() != o2.getView()) {
            return o1.getView()-o2.getView();
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
        if (o1.getReview()!=o2.getReview()){
            return o1.getReview() - o2.getReview();
        }
        return o1.getName().compareTo(o2.getName());
    }
}
