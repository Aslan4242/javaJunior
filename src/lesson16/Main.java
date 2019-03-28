package lesson16;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Tovar> tovars = new HashSet<>();

        Tovar tovar1 = new Tovar(12,100,"Mouse", 5, 7,10);
        Tovar tovar2 = new Tovar(13,100,"Notebook", 4, 6,15);
        Tovar tovar3 = new Tovar(22,150,"phone", 3, 8,12);
        Tovar tovar4 = new Tovar(55,1000,"tablet", 2, 9,11);
        Tovar tovar5 = new Tovar(72,700,"keyboard", 1, 10,13);
        Tovar tovar6 = new Tovar(64,660,"cable", 5, 5,14);

        tovars.add(tovar1);
        tovars.add(tovar2);
        tovars.add(tovar3);
        tovars.add(tovar4);
        tovars.add(tovar5);
        tovars.add(tovar6);

        SortTovar.sortByPrice(tovars);
        System.out.println();
        SortTovar.sortByPriceReverse(tovars);
        System.out.println();
        SortTovar.sortByBuy(tovars);
        System.out.println();
        SortTovar.sortByBuyReverse(tovars);
        System.out.println();
        SortTovar.sortByRating(tovars);
        System.out.println();
        SortTovar.sortByRatingReverse(tovars);
        System.out.println();
        SortTovar.sortByView(tovars);
        System.out.println();
        SortTovar.sortByViewReverse(tovars);
        System.out.println();
        SortTovar.sortByReview(tovars);
        System.out.println();
        SortTovar.sortByReviewReverse(tovars);
        System.out.println();
        SortTovar.sortByName(tovars);
        System.out.println();
        SortTovar.sortByNameReverse(tovars);
    }
}
