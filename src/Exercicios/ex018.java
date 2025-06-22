package Exercicios;

import java.util.Scanner;

public class ex018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dia: ");
        byte dia = input.nextByte();
        input.close();
        String utilOuFds = switch (dia) {
            case 1, 7 -> "Fim de semana";
            case 2, 3, 4, 5, 6 -> "Dia útil";
            default -> "Valor inválido";
        };

        System.out.println(utilOuFds);
    }
}
