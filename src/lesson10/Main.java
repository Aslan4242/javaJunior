package lesson10;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal",12,100);


        Lion lion = new Lion("Lion",13,200);
        Lion lion1 = new Lion("Lion1",13,200);
        Lion lion2 = new Lion("Lion2",13,200);

        Dog dog = new Dog("Dog", 14, 300);
        Dog dog1 = new Dog("Dog1", 14, 300);
        Dog dog2 = new Dog("Dog2", 14, 300);

        Animal [] zoo = new Animal[6];
        zoo[0]= dog;
        zoo[1]=dog1;
        zoo[2]=dog2;
        zoo[3]=lion;
        zoo[4]=lion1;
        zoo[5]=lion2;







    }
}
