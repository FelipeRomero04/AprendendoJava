package Exercicios;

import java.util.Scanner;

public class ex036 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Tabuada de: ");
        int value = input.nextInt();

        for (int i = 0; i < 11; i++){
            System.out.printf("%d x %d = %d\n", i, value, i*value);
        }
    }
}
