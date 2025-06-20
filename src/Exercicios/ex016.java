package Exercicios;

import java.util.Scanner;

public class ex016 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Distância da sua viajem: ");
        double km = input.nextDouble();

        double price = (km <= 200) ? km * 0.50: km * 0.45;

        System.out.printf("Você irá iniciar uma viagem de %.2fkm\nO custo da passagem é de R$%.2f", km, price);
    }
}
