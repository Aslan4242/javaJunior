package lesson7;

import lesson4.WorkArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringUtils {
    public static String codingMessage(String message) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] codingMassage = message.toCharArray();
        for (int i = 0; i < codingMassage.length; i++) {
            int indexCurrentChar = abc.indexOf(codingMassage[i]);
            if (indexCurrentChar != -1) {
                char newChar = abc.charAt(indexCurrentChar + 1);
                codingMassage[i] = newChar;
            }
        }

        return Arrays.toString(codingMassage);
    }

    public static int kolichestvoGlasnyh(String massage1) {
        String glasny = "aeiou";
        char[] text = massage1.toCharArray();
        int sum = 0;
        for (int i = 0; i < text.length; i++) {
            int index = glasny.indexOf(text[i]);
            if (index != -1) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    public static int countSoglasnie(String text) {// Задача 1
        String soglasnie = "bcdfghjklmnpqrstvwxyz";
        char[] chars = text.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            int current = soglasnie.indexOf(chars[i]);
            if (current != -1) {
                sum++;
            }
        }
        return sum;
    }

    public static String reverse(String text) {// Задача 2
        char[] chars = text.toCharArray();
        String reverse1 = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reverse1 = reverse1 + chars[i];
        }
        return reverse1;
    }

    public static String deleteZnakiPrepinania(String text) {//Заадча 3
        char[] chars = text.toCharArray();
        String s1 = "";
        for (int i = 0; i < text.length(); i++) {
            if (chars[i] == ',' || chars[i] == '-' || chars[i] == '_' || chars[i] == '.' || chars[i] == ';' || chars[i] == '"' || chars[i] == '/' || chars[i] == '!' || chars[i] == '?' || chars[i] == ':' || chars[i] == '(' || chars[i] == ')') {// не смог добавить апостроф
                continue;
            } else {
                s1 = s1 + chars[i];
            }
        }
        return s1;
    }
}
