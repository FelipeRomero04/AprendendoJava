package Exercicios;

import java.util.Scanner;

public class ex029 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Seu peso(Kg): ");
        double weight = input.nextDouble();

        System.out.print("Sua Altura(m): ");
        double height = input.nextDouble();

        double imc = weight / (Math.pow(height, 2));
        String situation;
        if (imc < 18.5){
            situation = "Você está Abaixo do peso";
        } else if (imc < 25) {
            situation = "Parabéns, Você está no Peso ideal";
        } else if (imc <= 30 ) {
            situation = "Você esta com Sobrepeso, se cuide";
        } else if (imc <= 40){
            situation = "Você esta em Obesidade";
        }else {
            situation = "Você esta com Obesidade mórbida, PROCURE UM ESPECIALISTA!";
        }

        System.out.printf("Seu imc é: %.1f\n%s", imc, situation);

    }
}
