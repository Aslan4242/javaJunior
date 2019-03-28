package Lesson12;

public class Teacher implements Rabotnik {

    @Override
    public void getSalary() {
        System.out.println("Я шофер и я получаю 20 000 рублей");
    }

    @Override
    public void doWork() {
        System.out.println("Я учитель и я учу");
    }
}
