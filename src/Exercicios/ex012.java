package Exercicios;

import java.util.Scanner;

public class ex012 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String phrase = input.nextLine().toLowerCase().strip();
        int countA = phrase.length() - phrase.replace("a","").length();
        int firstA = phrase.replace(" ", "").indexOf("a") + 1;
        int lastA = phrase.replace(" ", "").lastIndexOf("a") + 1;

        System.out.printf("A letra \"A\" aparece %d vezes na frase\n", countA);
        System.out.printf("A primeira letra \"A\" apareceu na posição %d\n", firstA);
        System.out.printf("A última letra \"A\" apareceu na posição %d\n", lastA);

    }
}
