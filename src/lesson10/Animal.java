package lesson10;

public class Animal {

    private String name;
    private int age;
    private int price;
    public Animal(){
        this.name = "fff";
        this.age = 0;
    }
    public Animal(String n, int a, int p){
        name = n;
        age = a;
        price = p;
    }

    public void setName(String n){
        name = n;
    }
    public String getName() {
        return name;
    }

    public  void setAge(int a){
        age = a;
    }
    public int getAge() {
        return age;
    }

    public void setPrice(int p){
        price = p;
    }
    public int getPrice() {
        return price;
    }

    public void print(){
        System.out.printf("Животное: имя - %s, возраст - %d, цена - %d",this.name, this.age, this.price);
    }



}
