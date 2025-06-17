package Exercicios;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Valor1: ");
        int num1 = input.nextInt();

        System.out.print("Valor2: ");
        double num2 = input.nextDouble();

        if (num1 % num2 == 0){
            System.out.println("É par");
        }
        else {
            System.out.println("É impar");
        }
    }
}
