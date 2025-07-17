package Exercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ex063 {
    public static void main(String[] args){
        Integer[] valuesChoice = new Integer[4] ;
        Random generator = new Random();

        for(int j = 0; j < valuesChoice.length; j++){
            valuesChoice[j] = generator.nextInt(1, 11);
            System.out.printf("%d ", valuesChoice[j]);
        }

        int bigger = Collections.max(Arrays.asList(valuesChoice));
        int smaller = Collections.min(Arrays.asList(valuesChoice));

        System.out.printf("\nO maior valor é %d e o menor é %d!", bigger, smaller);


    }
}
