package Exercicios;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double num = input.nextFloat();

        double dobro = num * 2;
        double triplo = num * 3;
        double raizQuadrada = Math.sqrt(num);

        System.out.printf("O dobro de %.2f vale %.2f\nO triplo vale %.2f\nA raiz quadrada é %.2f", num, dobro, triplo, raizQuadrada);
    }
}
