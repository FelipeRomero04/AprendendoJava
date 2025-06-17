package Aulas;

import java.util.Scanner;

public class operadores {
    public static void main(String[] args){
        //Operadores Aritiméticos

        Scanner input = new Scanner(System.in);

        System.out.println("Valor um: ");
        int num1 = input.nextInt();

        System.out.println("Valor dois: ");
        double num2 = input.nextDouble(); // Operação de números inteiros sempre será um número inteiro
        //double resultado = num1 / (double) num2; // exemplo de casting
        input.close();
        double resultado = num1 / num2;
        double resto = num1 % num2;
        System.out.println(resultado);

        //Operadores Relacionais

        boolean isMaiorQue = num1 > num2;
        boolean isMenorQue = num1 < num2;
        boolean isIgual = num1 == num2;
        boolean isDiferente = num1 != num2;

        // Operadores Lógicos
        // && (and) || (or) !(not)

        // && (and)
        int idade = 35;
        float salario = 4200;
        boolean isAcimaTrinta = idade > 30 && salario >= 4612;
        boolean isAbaixoTrinta = idade < 30 && salario >= 3381;

        //or (or)

        float contaCorrente = 200;
        float contaPoupanca = 10000;
        float valorPlay5 = 5000;
        boolean isCompravel = contaCorrente >= valorPlay5 || contaPoupanca >= valorPlay5;


        //Operadores de atribuição
        // ==, +=, -=, *=, /=, %=

        int bonus = 1000;
        bonus += 100;
        bonus -= 100;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        //Operadores Unários
        // ++contador / --contador (pré-incremento) | contador++ / contador-- (pos-incremento)

        int contador = 0;
        System.out.println(contador++); // Vai ser 0, primeiro é impresso o cont, depois incrementado

        contador = 0;

        System.out.println(++contador);

    }
}
