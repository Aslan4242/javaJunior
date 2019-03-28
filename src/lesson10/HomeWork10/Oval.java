package lesson10.HomeWork10;

public class Oval extends FigureRadius {
    private int b; // большая полуось

    public Oval() {

    }


    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void print(){
        System.out.printf("Площадь овала - %f\n", (Math.PI*this.getRadius()*this.b));//зачем писать this?
    }
}
