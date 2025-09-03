package ExerciciosOOP.ClassCEV;

import java.util.Arrays;

public class ex004Class {
    public static void maxNum(double ...num){
        double biggerNum = Arrays.stream(num).max().orElse(0);
        System.out.println("Os valores passados foram "+ Arrays.toString(num) +"\nTotal de "+ num.length+" valores.");
        System.out.println("O maior número é "+ String.format("%.1f", biggerNum) + ".");
        System.out.println("=".repeat(50));
    }
}
