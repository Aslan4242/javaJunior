package HomeWork9;

public class Planet {
    private String name;
    private int countSputnik;

    public void setName(String n) {
        name = n;
    }

    public void setCountSputnik(int sputnik) {
        countSputnik = sputnik;
    }

    public String getName() {
        return name;
    }

    public int getCountSputnik() {
        return countSputnik;
    }

    public Planet() {

    }

    public Planet(String n) {
        name = n;
    }

    public Planet(int sputnik) {
        countSputnik = sputnik;
    }

    public Planet(String n, int sputnik) {
        name = n;
        countSputnik = sputnik;
    }

    public void print() {
        System.out.printf("Название планеты - %s. Количество спутников - %d", name, countSputnik);
    }
}
