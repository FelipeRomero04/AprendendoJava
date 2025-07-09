package Exercicios;

import java.util.Scanner;

public class ex050 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número fatorial: ");
        int factorial = input.nextInt();

        int product = 1;

        System.out.printf("Calculando o fatorial de %d! = ", factorial);
        if(factorial < 0){
            System.out.println("Valor inválido! Não existe fatorial de números negativos.");
        }else {

            for (int i = factorial; i > 1; --i) { // loop para no 2
                product *= i;
                System.out.printf("%d x ", i);
            }
            System.out.printf("%d = %d ", 1, product);
            // finalizando ultima iteração fora do for

        }
    }
}
