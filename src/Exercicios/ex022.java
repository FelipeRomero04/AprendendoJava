package Exercicios;

import java.util.Scanner;

public class ex022 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Valor da propriedade: R$");
        double valueProperty = input.nextDouble();

        System.out.print("Salário do comprador: R$");
        double wage = input.nextDouble();

        System.out.print("Quantos anos de financiamento: ");
        byte financingYears = input.nextByte();

        double installment = valueProperty / (financingYears * 12);

        String lending = (installment > wage * 30 / 100) ? "EMPRÉSTIMO NEGADO": "EMPRÉSTIMO CONCEDIDO";

        System.out.printf("Para pagar uma propriedade de R$%.2f com o salario de R$%.2f, financiando em %d anos, a prestação será de R$%.2f.\n%s", valueProperty, wage, financingYears, installment, lending);
    }
}
