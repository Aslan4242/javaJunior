package HomeWork9;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMarka("BMW");
        car.setColor("Black");
        System.out.println(car.getMarka());
        car.print();
        System.out.println();

        Cat cat = new Cat();
        cat.setAge(5);
        cat.setName("Barsik");
        System.out.println(cat.getName());
        cat.print();
        System.out.println();

        Dog dog = new Dog();
        dog.setName("Tuzik");
        dog.setPoroda("Haski");
        System.out.println(dog.getName());
        dog.print();
        System.out.println();

        Building building = new Building();
        building.setVisota(400);
        building.setEtazh(100);
        System.out.println(building.getVisota());
        building.print();
        System.out.println();

        Planet planet = new Planet();
        planet.setName("Марс");
        planet.setCountSputnik(2);
        System.out.println(planet.getName());
        planet.print();

    }
}
