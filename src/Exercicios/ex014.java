package Exercicios;


import java.util.Random;
import java.util.Scanner;


public class ex014 {
    public static void main(String[] args){
        Random gerador = new Random();
        Scanner input = new Scanner(System.in);

        int machine = gerador.nextInt(1,6);

        System.out.print("Estou pensando em um número, tente adivinhar!(1 a 5): ");
        int user = input.nextInt();

        if (user == machine) {
            System.out.printf("Você Ganhou! Eu pensei no número %d também!", machine);
        }
        else{
            System.out.printf("Eu Ganhei! Pensei no número %d e você no %d!", machine, user);
        }

    }
}
