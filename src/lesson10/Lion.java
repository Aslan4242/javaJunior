package lesson10;

public class Lion extends Animal {
    public Lion(){

    }

    public Lion(String name, int age, int price) {
        this.setName(name);
        this.setAge(age);
        this.setPrice(price);
    }

    @Override
    public void print() {
        System.out.printf("Лев: имя - %s, возраст - %d, цена - %d",this.getName(), this.getAge(), this.getPrice());
    }

    public  void voice(){
        System.out.println("rrrrrr");
    }
}
