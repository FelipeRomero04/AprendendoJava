package Exercicios;

import java.util.Scanner;

public class ex052 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int firstTerm = 0;
        int reason = 0;

        try{
            System.out.print("Primeiro termo: ");
            firstTerm = input.nextInt();

            if (firstTerm < 0) {
                System.out.println("Número negativos serão convertidos em positivos pelo sistema.");
                firstTerm *= -1;
            }
        }catch (Exception e){
            System.out.println("Entrada inválida. Tente Novamente!");
            input.nextLine();
        }

        try {
            System.out.print("Razão: ");
            reason = input.nextInt();
            if (reason < 0){
                System.out.println("Número negativos serão convertidos em positivos pelo sistema.");
                reason *= -1;
            }

        }catch(Exception e){
            System.out.println("Entrada inválida. Tente Novamente!");
            input.nextLine();
        }

        int cont = 10;
        int iterations = 0;

        while(cont != 0){

            sb.append(firstTerm).append(" -> ");
            firstTerm += reason;

            if(cont == 1){
                sb.append(" PAUSA ");
                System.out.println(sb);
                sb.setLength(0);
                System.out.print("Quantos termos quer mostrar a mais? ");
                try {
                    cont = input.nextInt();
                    if (cont < 0){
                        System.out.println("Números negativos serão convertido em positivos pelo sistema.");
                        cont *= -1;
                        continue;
                    }
                }catch (Exception e){
                    System.out.println("ERRO: Entrada inválida! Tente Novamente.");
                    input.nextLine();
                }
                continue;
            }

            cont--;
            iterations++;
        }
        System.out.printf("Progressão finalizada em %d termos mostrados", iterations);

    }
}
