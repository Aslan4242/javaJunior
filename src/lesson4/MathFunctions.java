package lesson4;

public class MathFunctions {
    // модиифкатор доступа(4 вида)
    //статичность static- принадлежность классу; если пусто- принадлежность объекту
    // возвращаемый тип: void(если ничего не возращает) или тип (если возврщается)
    // название метода
    // входящие параметры
    public static int summaThree(int a, int b, int c){
        int summa = a + b + c;
        return summa;
    }

    public static double profit (int year, int money, int percent){
        for (int i = 0; i < year; i++) {
            money = money + (money / 100 * percent);
        }
        return money;
    }

    public static double square (int a, int b, int c){
        double halfperimeter = (a+b+c)/2;

        double result = Math.sqrt(halfperimeter*(halfperimeter-a)*(halfperimeter-b)*(halfperimeter-c));
        return result;
    }



}
