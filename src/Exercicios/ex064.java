package Exercicios;

import java.util.List;
import java.util.Set;

public class ex064 {
    public static void main(String[] args){
        List<String> words = List.of("aprender", "programar", "logica", "praticar", "piru");
        Set<String> vowel = Set.of("a", "e","i","o","u");

        for (String i : words ){
            System.out.printf("A palavra %s tem ",i.toUpperCase());

            for (char j : i.toCharArray()){
                if (vowel.contains(String.valueOf(j))){
                    System.out.printf("%s ", j);
                }
            }
            System.out.println();

        }
    }
}
