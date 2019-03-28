package lesson9;

public class Book {
    private int page;
    private String name;
    private String autor;
    private int price;
    private int year;

    public Book(){

    }

    public Book(String nameBook, String autorB){
        name = nameBook;
        autor = autorB;
    }
    public Book(String nameBook, String autorB, int pg, int prc, int yr){
        page = pg;
        name = nameBook;
        autor = autorB;
        price = prc;
        year = yr;
    }

    public void print(){
        System.out.printf("Название книги - %s, автор - %s", name, autor);
    }

}
