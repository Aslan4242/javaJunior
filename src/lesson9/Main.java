package lesson9;

public class Main {
    public static void main(String[] args) {
        Student vasya = new Student();
        Student petya = new Student();

        double result = vasya.perimetr(2, 4, 7);
        System.out.println(result);

        vasya.setName("Vasya");
        petya.setName("Petya !!!");

        vasya.setAge(20);
        vasya.setSurname("Ivanov");

        petya.setAge(25);
        petya.setSurname("Petrov");

        System.out.println(petya.getName());


    }
}
