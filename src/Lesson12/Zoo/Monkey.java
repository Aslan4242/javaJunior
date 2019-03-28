package Lesson12.Zoo;

import java.sql.SQLOutput;

public class Monkey implements ZooAnimal {
    @Override
    public void voice() {
        System.out.println("уауауауауау");
    }

    @Override
    public void jump() {
        System.out.println("Обезьяна прыгает");
    }
}
