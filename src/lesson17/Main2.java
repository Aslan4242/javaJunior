package lesson17;

public class Main2 {
    public static void main(String[] args) {
        Holodilnik holodilnik = new Holodilnik();
        holodilnik.addProduct("apple",2);
        holodilnik.addProduct("apple",1);
        holodilnik.addProduct("grusha",3);
        holodilnik.addProduct("sliva",1);
        holodilnik.addProduct("slivki",4);

        holodilnik.deleteProduct("grusha",3);
        holodilnik.printList();

    }
}
