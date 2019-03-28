package lesson9;

public class MainBook {
    public static void main(String[] args) {
        Book book = new Book("Гарри Поттер", "Джоан Роулинг",600,100,2010);
        Book book1 = new Book();
        book.print();
    }
}
