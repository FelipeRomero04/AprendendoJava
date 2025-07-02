package Exercicios;

import java.util.Scanner;

public class ex043 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String phrase = input.nextLine().toLowerCase().trim().replace(" ", "");
        String reverse = new StringBuilder(phrase).reverse().toString();

        System.out.printf("O inverso de %s é %s\nA frase digitada %s",
                phrase, reverse, (phrase.equals(reverse) ? "É UM PALÍNDROMO" : "NÃO É UM PALÍNDROMO"));
    }
}
