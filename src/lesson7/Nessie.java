package lesson7;

public class Nessie {
    public static boolean isLockNessMonster(String s){
        if (s.contains("tree fiddy")){
            return true;
        }else if(s.contains("3.50")) {
            return true;
        }else {
            return false;
        }
    }
    public static String abbrevName(String name) {
        String abb = "";
        abb = abb + name.charAt(0) +".";
        for (int i =0; i<name.length();i++){
            if (name.charAt(i)==' ' && name.charAt(i+1)!=' '){
                abb=abb+name.charAt(i+1);
            }
        }
        String a = abb.toUpperCase();
        return a;
    }
}