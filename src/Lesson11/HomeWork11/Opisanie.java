package Lesson11.HomeWork11;

public class Opisanie {
    private String text;
    private String color;
    private String podsvetka;
    private int knopki;
    private boolean dopKnopki;
    private String typeSensor;

    public Opisanie() {
    }

    public Opisanie(String text, String color, String podsvetka, int knopki, boolean dopKnopki, String typeSensor) {
        this.text = text;
        this.color = color;
        this.podsvetka = podsvetka;
        this.knopki = knopki;
        this.dopKnopki = dopKnopki;
        this.typeSensor = typeSensor;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPodsvetka() {
        return podsvetka;
    }

    public void setPodsvetka(String podsvetka) {
        this.podsvetka = podsvetka;
    }

    public int getKnopki() {
        return knopki;
    }

    public void setKnopki(int knopki) {
        this.knopki = knopki;
    }

    public boolean isDopKnopki() {
        return dopKnopki;
    }

    public void setDopKnopki(boolean dopKnopki) {
        this.dopKnopki = dopKnopki;
    }

    public String getTypeSensor() {
        return typeSensor;
    }

    public void setTypeSensor(String typeSensor) {
        this.typeSensor = typeSensor;
    }
}
