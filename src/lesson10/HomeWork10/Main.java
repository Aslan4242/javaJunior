package lesson10.HomeWork10;

public class Main {
    public static void main(String[] args) {
        Pryamougolnik pryamougolnik = new Pryamougolnik(10,20);
        pryamougolnik.print();

        Kvadrat kvadrat = new Kvadrat(10);
        kvadrat.print();

        Treugolnik treugolnik = new Treugolnik(4,5,7);
        treugolnik.print();

        Oval oval = new Oval();
        Krug krug = new Krug();

        krug.setRadius(15);

        oval.setRadius(4);
        oval.setB(20);



    }
}
