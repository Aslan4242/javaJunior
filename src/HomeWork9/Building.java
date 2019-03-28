package HomeWork9;

public class Building {
    private int visota;
    private int etazh;

    public void setVisota(int v) {
        visota = v;
    }

    public void setEtazh(int e) {
        etazh = e;
    }

    public int getVisota() {
        return visota;
    }

    public int getEtazh() {
        return etazh;
    }

    public Building() {

    }

    public Building(int v) {
        visota = v;
    }

    public Building(int v, int e) {
        visota = v;
        etazh = e;
    }

    public void print() {
        System.out.printf("Высота здания %d метров", visota);
    }
}
