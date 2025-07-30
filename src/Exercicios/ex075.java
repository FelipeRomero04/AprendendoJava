package Exercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex075 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random generator = new Random();

        int numsort;
        System.out.print("How many plays you want me to draw? ");
        try {
            numsort = Integer.parseInt(input.nextLine());
            if (numsort < 0 || numsort > 50){
                System.out.println("Só são permitidos até 50 jogadas!");
                return;
            }
        }catch (Exception e){
            System.out.println("Ocorreu um erro! Tente novamente!");
            return;
        }

        final int AMOUNT_NUMBERS = 6;
        int[][] listGuesses = new int[numsort][AMOUNT_NUMBERS];

        System.out.printf("DRAWING %d PLAYS\n", numsort);
        for (int i = 0; i < listGuesses.length; i++) {
            for (int j = 0; j < AMOUNT_NUMBERS; j++) {
                int num = generator.nextInt(1, 61);
                if (Arrays.stream(listGuesses[i]).anyMatch(n -> n == num)){ // Metodo conteins com array
                    j--;
                    continue;
                }
                listGuesses[i][j] = num;
            }
            Arrays.sort(listGuesses[i]);
            System.out.printf("Jogo %d: %s\n", i + 1, Arrays.toString(listGuesses[i]));
        }


    }
}
