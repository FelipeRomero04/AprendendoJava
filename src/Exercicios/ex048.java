package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class ex048 {
    public static void main(String[] args){
        Random generator = new Random();
        Scanner input = new Scanner(System.in);
        byte trys = 0;

        System.out.println("Pensei em um número de 1 a 10. Consegue adivinhar?");
        int machine = generator.nextInt(1, 11);

        System.out.print("Palpite: ");
        byte user = input.nextByte();

        while(user != machine){
            if (user > 10){
                System.out.print("Tentativa inválida. insira um número de 1 a 10: ");
                user = input.nextByte();
                trys++;


            } else if (machine > user) {
                System.out.print("Quase! Ta quente... De novo: ");
                user = input.nextByte();
                trys++;

            }else{
                System.out.println("Frioo! Um pouco menos... De novo: ");
                user = input.nextByte();
                trys++;
            }
        }

        System.out.printf("PARABÉNS! pensei no número %d e você no %d também.\nTentativa(s): %d", machine, user, trys);
    }
}
