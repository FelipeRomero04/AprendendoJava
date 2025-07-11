package Exercicios;

import java.util.Scanner;

public class ex053 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.print("Quantos números da sequência de fibonacci quer ver? ");
        int terms = input.nextInt();

        int f1 = 0;
        int f2 = 1;
        int total;

        while(terms != 0){
            sb.append(f1).append(" -> ");

            total = f1 + f2;
            f1 = f2;
            f2 = total;

            terms--;
        }
        System.out.print(sb);
        System.out.println("FIM");


    }
}
