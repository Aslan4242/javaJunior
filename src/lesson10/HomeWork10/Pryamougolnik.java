package lesson10.HomeWork10;

public class Pryamougolnik {
    private int length;
    private int width;


    public Pryamougolnik() {

    }

    public Pryamougolnik(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }// почему метод не используется

    public void setWidth(int width) {
        this.width = width;
    }// почему метод не используется

    public void print() {
        System.out.printf("Площадь прямоугольника - %d\n", (length * width));
    }
}
