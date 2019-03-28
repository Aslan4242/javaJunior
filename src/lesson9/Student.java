package lesson9;

public class Student {
    private int age = 0;
    private String name = null;
    private String surname = null;

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setSurname(String sur) {
        surname = sur;
    }

    public String getName() {
        return name;
    }

    public double perimetr(int a, int b, int c) {
        return a + b + c;
    }
}
