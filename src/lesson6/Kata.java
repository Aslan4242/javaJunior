package lesson6;

import java.sql.SQLOutput;

public class Kata {
    public static void main(String[] args) {
        Bio b = new Bio();
        System.out.println(b.dnaToRna("GCAT"));


    }

    static class Bio {
        public String dnaToRna(String dna) {

            String rna = dna.replace('T','U');

            return rna;  // Do your magic!
       }
    }
}

