package lesson5;

import java.awt.font.FontRenderContext;

public class HW {
    public static void minFrom4Numbers(int a, int b, int c, int d) {
        if (a <= b && a <= c && a <= d) {
            System.out.println(a);
        } else if (b <= a && b <= c && b <= d) {
            System.out.println(b);
        } else if (c <= a && c <= b && c <= d) {
            System.out.println(c);
        } else if (d <= a && d <= b && d <= c) {
            System.out.println(b);
        }
    }
    public static void minFrom4Numbers(int[] nums){
        int min = nums[0];
        for (int i = 1; i<nums.length; i++){
            if (nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println(min);
    }

}
