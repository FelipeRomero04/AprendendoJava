package Exercicios;

import java.util.Scanner;

public class ex009 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        int u = num % 10;
        int d = num / 10 % 10;
        int c = num / 100 % 10;
        int m = num / 1000 % 10;

        System.out.printf("Unidade: %d\n", u);
        System.out.printf("Dezena: %d\n", d);
        System.out.printf("Centena: %d\n", c);
        System.out.printf("Milhar: %d\n", m);

    }
}
