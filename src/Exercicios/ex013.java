package Exercicios;

import java.util.Scanner;

public class ex013 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = input.nextLine();
        String[] listName = nome.split(" ");
        String firstName = listName[0];
        String lastName = listName[listName.length - 1];

        System.out.printf("Meu primeiro nome é: %s\n", firstName);
        System.out.printf("Meu último nome é: %s\n", lastName);
    }
}
