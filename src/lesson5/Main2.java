package lesson5;

public class Main2 {
    public static void main(String[] args) {
        int[][] numbers = {{2, 4, 7, 7}, {2, 5, 8, 3}};
//        System.out.print(numbers[0][0] + " ");
//        System.out.print(numbers[0][1] + " ");
//        System.out.print(numbers[0][2] + " ");
//        System.out.print(numbers[0][3] + " ");

        for (int i =numbers.length-1; i>=0; i--){
            for (int j=numbers[i].length-1; j>=0;j--){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
