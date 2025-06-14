package Exercicios;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = input.nextLine();

        System.out.print("Digite seu endereço: ");
        String adress = input.nextLine();

        System.out.print("Digite seu salário: ");
        Double wage = input.nextDouble();
        input.nextLine(); //liberando buffer

        System.out.print("Data me que recebeu: ");
        String date = input.nextLine();

        input.close();

        System.out.printf("Eu %s, morando no endereço %s, confirmo que recebi o sálario de %.2f, na data %s",
                name, adress, wage, date);

    }
}
