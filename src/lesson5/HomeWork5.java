package lesson5;

public class HomeWork5 {
    public static void main(String[] args) {
        int [][] numbers = {{1,2,3,4},{5,6,7,8}};
        for (int i=0; i<numbers.length; i++){   //Задача1
            for (int j=0; j<numbers[i].length; j++){
                if (numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+",");
                }else{
                    System.out.print(" ,");
                }
            }
        }
        int sum = 0;                   //Задача2
        for (int i =0; i<numbers.length;i++){
            for (int j =0; j<numbers[i].length;j++){
              sum=sum+numbers[i][j];
            }
        }
        System.out.println(sum);
    }
}
