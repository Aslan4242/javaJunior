package Lesson13.hm13;

public class Main {
    public static void main(String[] args) {
        Typography book = new Book();
        Typography copyBook = new CopyBook();
        Typography magazine = new Magazine();

        Typography[] typographies = new Typography[3];
        typographies[0] = book;
        typographies[1] = copyBook;
        typographies[2] = magazine;


    }
}
