package lesson8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main3 {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        int sum =0;
        for (int i = 0; i<100000;i++){
            sum = sum+i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-currentTime);

        Date currentDate = new Date(currentTime);
        System.out.println(currentDate);

        Date time = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd 'at' HH:mm:ss");
        System.out.println(dateFormat.format(currentDate));

        if(currentDate.after(time)){
            System.out.println("hshsh");
        }else{
            System.out.println("a");
        }
    }
}
