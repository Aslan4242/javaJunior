package lesson16;

public class Tovar implements Comparable<Tovar> {

    private int buy;
    private int price;
    private String name;
    private int rating;
    private int view;
    private int review;

    public Tovar() {
    }

    public Tovar(int buy, int price, String name, int rating, int view, int review) {
        this.buy = buy;
        this.price = price;
        this.name = name;
        this.rating = rating;
        this.view = view;
        this.review = review;
    }

    public int getBuy() {
        return buy;
    }

    public void setBuy(int buy) {
        this.buy = buy;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tovar tovar = (Tovar) o;

        if (buy != tovar.buy) return false;
        if (price != tovar.price) return false;
        if (rating != tovar.rating) return false;
        if (view != tovar.view) return false;
        if (review != tovar.review) return false;
        return name != null ? name.equals(tovar.name) : tovar.name == null;
    }

    @Override
    public int hashCode() {
        int result = buy;
        result = 31 * result + price;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + rating;
        result = 31 * result + view;
        result = 31 * result + review;
        return result;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "buy=" + buy +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                ", view=" + view +
                ", review=" + review +
                '}';
    }


    @Override
    public int compareTo(Tovar o) {
        if (this.price != o.price) {
            return this.price - o.price;
        }

        if (this.buy != o.buy) {
            return this.buy - o.buy;
        }
        if (this.rating != o.rating) {
            return this.rating - o.rating;
        }
        if (this.view != o.view) {
            return this.view - o.view;
        }
        if (this.review!=o.review){
            return this.review-o.review;
        }
        return this.name.compareTo(o.name);
    }


}
