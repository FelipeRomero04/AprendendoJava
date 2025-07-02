package Exercicios;

import java.util.Scanner;

public class ex042 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();
        int cont = 0;

        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                System.out.printf("{%d} ", i);
                cont++;
            } else{
                System.out.printf("%d ", i);
            }
        }
        System.out.printf("\nO número %d foi dividido %d vezes\nE por isso ele é %s",
                num, cont, (cont > 2) ? "NÃO É PRIMO" : "É PRIMO");
    }
}
