package lesson8;

public class Main1 {
    public static void main(String[] args) {
        int i = 4;
        switch (i){
            case 2:
                System.out.println("очень плохо");
                break;
            case 3:
                System.out.println("не очень");
                break;
            case 4:
                System.out.println("хорошо");
                break;
            case 5:
                System.out.println("отлично");
                break;
                default:
                    System.out.println("вы ввели");
        }
    }
}
