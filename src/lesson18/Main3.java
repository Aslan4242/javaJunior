package lesson18;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        File dir = new File("E:\\ФЛЕШКА");
        File[] dirs = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.getAbsolutePath().endsWith(".jpg")){
                    return true;
                }
                return false;
            }

        });
        for (File f: dirs) {
            System.out.println(f.getAbsolutePath());
        }

    }
}
