package HomeWork9;

public class Cat {
    private String name;
    private String color;
    private int age;

    public void setName(String nm) {
        name = nm;
    }

    public String getName() {
        return name;
    }

    public void setColor(String clr) {
        color = clr;
    }

    public String getColor() {
        return color;
    }

    public void setAge(int vozrast) {
        age = vozrast;
    }

    public int getAge() {
        return age;
    }

    public Cat() {

    }

    public Cat(String nm) {
        name = nm;
    }

    public Cat(int vozrast) {
        age = vozrast;
    }

    public Cat(String nm, String clr) {
        name = nm;
        color = clr;
    }

    public Cat(String nm, int vozrast) {
        name = nm;
        age = vozrast;
    }

    public Cat(String nm, String clr, int vozrast) {
        name = nm;
        color = clr;
        age = vozrast;
    }

    public void print() {
        System.out.printf("Кота зовут %s", name);
    }
}
