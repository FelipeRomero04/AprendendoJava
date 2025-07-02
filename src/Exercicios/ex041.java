package Exercicios;

import java.util.Scanner;

public class ex041 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Primeiro termo: ");
        int firstTerm = input.nextInt();

        System.out.print("Razão: ");
        int reason = input.nextInt();

        for (int i = 0; i < 10; i++){
            if (i == 9) {
                System.out.printf("%d", firstTerm);
                break;
            }
            System.out.printf("%d -> ", firstTerm);
            firstTerm += reason;

        }
    }
}
