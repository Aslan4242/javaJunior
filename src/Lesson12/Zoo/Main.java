package Lesson12.Zoo;

public class Main {
    public static void main(String[] args) {
        ZooAnimal[] animal = new ZooAnimal[6];

        animal[0] = new Monkey();
        animal[1] = new Lion();
        animal[2] = new Monkey();
        animal[3] = new Lion();
        animal[4] = new Monkey();
        animal[5] = new Monkey();

        for (int i = 0; i < animal.length; i++) {
            animal[i].jump();
        }
    }
}
