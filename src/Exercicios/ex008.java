package Exercicios;

import java.util.Scanner;

public class ex008 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = input.nextLine();

        String nomeMaiusculo = nome.toUpperCase();
        String nomeMinusculo = nome.toLowerCase();
        int nomeComprimento = nome.replace(" ", "").length();
        int primeiroNome = nome.indexOf(" ");

        System.out.printf("Seu nome em maiúsculas é %s\n", nomeMaiusculo);
        System.out.printf("Seu nome em minúsculas é %s\n", nomeMinusculo);
        System.out.printf("Seu nome tem %d letras ao todo\n", nomeComprimento);
        System.out.printf("Seu primeiro nome é %s e ele tem %d letras", nome.substring(0, primeiroNome), nome.substring(0, primeiroNome).length() );
    }
}
