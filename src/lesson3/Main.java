package lesson3;

public class Main {
    public static void main(String[] args) {
        for (int i = 0;i<365;i++){
            for (int j = 0;j<24; j++){
                for(int k = 0; k<60; k++){
                    for (int s = 0; s<60; s++){
                        System.out.println("от старта прошло: "+ i + " дней, "+j+" часа, "+k+" минут, "+s+" секунд.");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
