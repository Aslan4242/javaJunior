package Lesson11.HomeWork11;

public class Haraktesitiki {
    private String model;
    private String color;
    private int shirina;
    private int visota;
    private int dlina;

    public Haraktesitiki() {
    }

    public Haraktesitiki(String model, String color, int shirina, int visota, int dlina) {
        this.model = model;
        this.color = color;
        this.shirina = shirina;
        this.visota = visota;
        this.dlina = dlina;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getShirina() {
        return shirina;
    }

    public void setShirina(int shirina) {
        this.shirina = shirina;
    }

    public int getVisota() {
        return visota;
    }

    public void setVisota(int visota) {
        this.visota = visota;
    }

    public int getDlina() {
        return dlina;
    }

    public void setDlina(int dlina) {
        this.dlina = dlina;
    }
}
