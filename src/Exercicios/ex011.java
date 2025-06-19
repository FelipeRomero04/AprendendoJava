package Exercicios;

import java.util.Scanner;

public class ex011 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        boolean isSilva = input.nextLine().toLowerCase().trim().contains("silva");

        System.out.printf("Seu nome tem Silva? %b", isSilva);
    }
}
