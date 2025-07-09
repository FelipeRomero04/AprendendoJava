package Exercicios;

import java.util.Scanner;

public class ex052 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.print("Primeiro termo: ");
        int firstTerm = input.nextInt();
        System.out.print("Razão: ");
        int reason = input.nextInt();

        int cont = 10;

        while(true){
            sb.append(firstTerm).append(" -> ");
            firstTerm += reason;

            if(cont == 1){
                sb.append(" PAUSA ");
                System.out.println(sb);
                sb.setLength(0);
                System.out.print("Quantos termos quer mostrar a mais? ");
                cont = input.nextInt();
            } else if (cont == 0) {
                break;
            }

            cont--;
        }
        //Colocar quantos termos ao todo, pensei em colocar uma var iterations++,
        //caso não pense nada melhor...

    }
}
