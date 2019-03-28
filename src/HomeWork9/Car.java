package HomeWork9;

public class Car {
    private String marka;
    private int price;
    private String color;

    public void setMarka(String mrk) {
        marka = mrk;
    }

    public String getMarka() {
        return marka;
    }

    public void setPrice(int prc) {
        price = prc;
    }

    public int getPrice() {
        return price;
    }

    public void setColor(String clr) {
        color = clr;
    }

    public String getColor() {
        return color;
    }

    public Car() {

    }

    public Car(String mrk) {
        marka = mrk;
    }

    public Car(String mrk, int prc) {
        marka = mrk;
        price = prc;
    }

    public Car(String mrk, String clr) {
        marka = mrk;
        color = clr;
    }

    public Car(int prc, String clr) {
        price = prc;
        color = clr;
    }

    public Car(String mrk, int prc, String clr) {
        marka = mrk;
        price = prc;
        color = clr;
    }

    public void print() {
        System.out.printf("Марка автомобиля-%s, цвет-%s", marka, color);
    }


}
