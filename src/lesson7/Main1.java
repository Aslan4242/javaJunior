package lesson7;

public class Main1 {
    public static void main(String[] args) {
        String text = "text qwerty eee";
        text.replace(' ', '-');
        String newText = text.replace(" ", "-");
        System.out.println(newText);

        char c = text.charAt(2);
        System.out.println(c);

        char[] charsFromText = text.toCharArray();
        System.out.println(charsFromText);



    }
}
