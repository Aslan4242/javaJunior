package Lesson12.HomeWork;

public class Main {
    public static void main(String[] args) {
        FractionNumberImpl drob = new FractionNumberImpl(5, 7);
        FractionNumberImpl drob2 = new FractionNumberImpl(3, 4);

        System.out.println(drob.toString());

        FractionNumberOperationImpl operation = new FractionNumberOperationImpl();
        FractionNumber result = operation.add(drob, drob2);
        System.out.println(result.toString());

        FractionNumber result1 = operation.sub(drob, drob2);
        System.out.println(result1.toString());

        FractionNumber result2 = operation.mul(drob, drob2);
        System.out.println(result2.toString());

        FractionNumber result3 = operation.div(drob, drob2);
        System.out.println(result3.toString());






    }

}
