package lesson1;

public class HomeWork1 {
    public static void main(String[] args) {

        //Task2
        int lengthBox = 20;
        int widthBox = 12;
        int heightBox = 8;

        int lengthCube = 10;
        int widthCube = 6;
        int heightCube = 4;

        System.out.println((lengthBox*widthBox*heightBox)/(lengthCube*widthCube*heightCube));

        //Task3
        int side1 = 16;
        int side2 = 14;
        int side3 = 12;

        double halfperimeter = (side1+side2+side3)/2;

        System.out.println(Math.sqrt(halfperimeter*(halfperimeter-side1)*(halfperimeter-side2)*(halfperimeter-side3)));

        //Task1

        int side4 = 18;
        int side5 = 17;
        int side6 = 16;

        if(side4==side5 & side4==side6){
            System.out.println("Равносторонний");
        } else if((side4==side5 & side4!=side6)|| (side4==side6 & side4!=side5) || (side5==side6 & side5!=side4)){
            System.out.println("Равнобедренный");
        }else{
            System.out.println("Разносторонний");
        }



    }
}
