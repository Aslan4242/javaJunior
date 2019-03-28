package lesson16;

import java.util.HashSet;
import java.util.TreeSet;

public class SortTovar {
    public static void sortByPrice(HashSet<Tovar>tovars) {
        TreeSet<Tovar> result = new TreeSet<>();
        result.addAll(tovars);
        for (Tovar t:result) {
            System.out.println(t);
        }

    }
    public static void sortByPriceReverse(HashSet<Tovar>tovars) {
        TreeSet<Tovar> result = new TreeSet<>(new PriceReverse());
        result.addAll(tovars);
        for (Tovar t:result) {
            System.out.println(t);
        }
    }
    public static void sortByBuy(HashSet<Tovar> tovars){
        TreeSet<Tovar> result = new TreeSet<>(new SortBuy());
        result.addAll(tovars);
        for (Tovar t:result) {
            System.out.println(t);
        }
    }
    public static void sortByBuyReverse(HashSet<Tovar> tovars){
        TreeSet<Tovar> result = new TreeSet<>(new SortBuyReverse());
        result.addAll(tovars);
        for (Tovar t:result) {
            System.out.println(t);
        }
    }
    public static void sortByRating(HashSet<Tovar>tovars){
        TreeSet<Tovar> result = new TreeSet<>(new SortRating());
        result.addAll(tovars);
        for (Tovar t:result) {
            System.out.println(t);
        }
    }
    public static void sortByRatingReverse(HashSet<Tovar>tovars){
        TreeSet<Tovar> result = new TreeSet<>(new SortRatingReverse());
        result.addAll(tovars);
        for (Tovar t:result) {
            System.out.println(t);
        }
    }
    public static void sortByView(HashSet<Tovar>tovars){
        TreeSet<Tovar> result = new TreeSet<>(new SortView());
        result.addAll(tovars);
        for (Tovar t:result) {
            System.out.println(t);
        }
    }
    public static void sortByViewReverse(HashSet<Tovar>tovars){
        TreeSet<Tovar> result = new TreeSet<>(new SortViewReverse());
        result.addAll(tovars);
        for (Tovar t:result) {
            System.out.println(t);
        }
    }
    public static void sortByReview(HashSet<Tovar>tovars){
        TreeSet<Tovar> result = new TreeSet<>(new SortReview());
        result.addAll(tovars);
        for (Tovar t:result) {
            System.out.println(t);
        }
    }
    public static void sortByReviewReverse(HashSet<Tovar>tovars){
        TreeSet<Tovar> result = new TreeSet<>(new SortReviewReverse());
        result.addAll(tovars);
        for (Tovar t:result) {
            System.out.println(t);
        }
    }
    public static void sortByName(HashSet<Tovar>tovars){
        TreeSet<Tovar> result = new TreeSet<>(new SortName());
        result.addAll(tovars);
        for (Tovar t:result) {
            System.out.println(t);
        }
    }
    public static void sortByNameReverse(HashSet<Tovar>tovars){
        TreeSet<Tovar> result = new TreeSet<>(new SortNameReverse());
        result.addAll(tovars);
        for (Tovar t:result) {
            System.out.println(t);
        }
    }
}
