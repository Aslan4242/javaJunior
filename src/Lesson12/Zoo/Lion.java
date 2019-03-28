package Lesson12.Zoo;

import java.sql.SQLOutput;

public class Lion implements ZooAnimal {

    @Override
    public void voice() {
        System.out.println("RRRRRRRRRR");
    }

    @Override
    public void jump() {
        System.out.println("Лев прыгает");
    }
}
