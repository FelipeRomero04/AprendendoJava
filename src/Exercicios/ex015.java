package Exercicios;

import java.util.Scanner;

public class ex015 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Velocidade do veículo: ");
        int km = input.nextInt();

        double trafficFine = (km - 80) * 7;

        if (km > 80){
            System.out.printf("MULTADO! Excedeu o limite de 80km/h\nValor a pagar: R$%.2f", trafficFine);
        }
        else{
            System.out.println("Tenha um bom dia! Dirija com segurança.");
        }

    }
}
