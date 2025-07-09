package Exercicios;

import java.util.Scanner;

public class ex051 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.print("Primeiro Termo: ");
        int firstTerm = input.nextInt();
        System.out.print("Razão: ");
        int reason = input.nextInt();

        byte cont = 0;

        while (cont < 10){
            sb.append(firstTerm).append(" -> ");
            firstTerm += reason;
            cont++;
        }
        sb.append("FIM");
        System.out.println(sb);
    }
}
