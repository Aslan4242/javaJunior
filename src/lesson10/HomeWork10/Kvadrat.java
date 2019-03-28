package lesson10.HomeWork10;

public class Kvadrat extends Pryamougolnik {

    public Kvadrat() {

    }
    public Kvadrat(int length) {
        this.setLength(length);
    }


    public void print() {
        System.out.printf("Площадь квадрата - %d\n", (getLength() *getLength()));
    }
}
