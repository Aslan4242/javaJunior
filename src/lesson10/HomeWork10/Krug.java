package lesson10.HomeWork10;

public class Krug extends FigureRadius {

    public Krug() {
    }


    public void print(){
        System.out.printf("Площадь круга - %f", Math.PI*this.getRadius()*this.getRadius());
    }
}
