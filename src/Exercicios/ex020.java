package Exercicios;

import java.util.Scanner;

public class ex020 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Qual é o salário do funcionário: R$");
        double salario = input.nextDouble();
        double salarioComAumento = (salario >= 1250) ? salario + (salario * 10 / 100): salario + (salario * 15 / 100);

        System.out.printf("Quem ganhava R$%.2f passou a ganhar R$%.2f agora.", salario, salarioComAumento);
    }
}
