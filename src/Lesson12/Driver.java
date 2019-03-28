package Lesson12;

import java.sql.SQLOutput;
import java.util.Objects;

public class Driver implements Father,Rabotnik{
    private int age;
    private String name;

    public Driver() {
    }

    public Driver(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void goToSad() {
        System.out.println("Я шофер и я отвожу ребенка на машине");
    }

    @Override
    public void backFromSad() {
        System.out.println("Я шофер и я забираю ребенка на машине");
    }

    @Override
    public void getSalary() {
        System.out.println("Я шофер и я получаю 40 000 рублей");
    }

    @Override
    public void doWork() {
        System.out.println("Я шофер и я еду");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return age == driver.age &&
                Objects.equals(name, driver.name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
