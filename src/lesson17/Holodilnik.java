package lesson17;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Holodilnik {
    private HashMap<String, Integer> products = new HashMap<>();
    private int capacity = 50;


    public void addProduct(String product, int value) {
        if (products.containsKey(product)) {
            int currentValue = products.get(product);
            int newValue = value + currentValue;
            products.put(product, newValue);
        } else {
            products.put(product, value);
        }
    }

    public void deleteProduct(String product, int value) {
        if (!products.containsKey(product)) {
            System.out.println("Такого продукта нет!");
            return;
        }

        int currentValue = products.get(product);
        if (value > currentValue) {
            System.out.println("Слишком много");
            return;
        }

        int newValue = currentValue - value;
        if (newValue == 0) {
            products.remove(product);
        } else {
            products.put(product, newValue);
        }


    }

    public void printList() {
        Set<String> prodName = products.keySet();
        for (String name : prodName) {
            System.out.printf("%s - %d кг ", name, products.get(name));
            System.out.println();
        }
    }

}
