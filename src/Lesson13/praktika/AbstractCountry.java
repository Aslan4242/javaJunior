package Lesson13.praktika;

public abstract class AbstractCountry implements Country {
    private int naselenie;
    private int countKurort;
    private int square;
    private String capital;
    private boolean Visa;


    public int getNaselenie() {
        return naselenie;
    }

    public void setNaselenie(int naselenie) {
        this.naselenie = naselenie;
    }

    public int getCountKurort() {
        return countKurort;
    }

    public void setCountKurort(int countKurort) {
        this.countKurort = countKurort;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public boolean isVisa() {
        return Visa;
    }

    public void setVisa(boolean visa) {
        Visa = visa;
    }

    @Override
    public void printPeople() {
        System.out.println(naselenie);
    }

    @Override
    public void printKurorty() {
        System.out.println(countKurort);
    }

    @Override
    public void printSquare() {
        System.out.println(square);
    }

    @Override
    public String getCapital() {

        return capital;
    }

    @Override
    public boolean needVisa() {
        return Visa;
    }


}
