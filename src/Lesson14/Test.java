package Lesson14;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String>list= new ArrayList<String>();

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        for (int i = 0; i<n; i++){
            String s = reader.readLine();
            list.add(s);
        }
        for (int i =0; i<m; i++){
            list.add(list.get(0));
            list.remove(0);
        }

        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
