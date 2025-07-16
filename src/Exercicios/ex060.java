package Exercicios;

import java.util.Scanner;

public class ex060 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int[] bankNotes = {50, 20, 10, 1};
        int[] contNotes = new int[4];
        int index = 0;

        System.out.print("Valor do saque: ");
        String line = input.nextLine();

        int value = 0;

        try{
            value = Integer.parseInt(line);
            if (value <= 0){
                System.out.println("Você não realizou nenhum saque. Volte sempre!");
                return;
            }

        }catch (Exception e){
            System.out.println("ERRO: Reinicie o sistema de saque.");
        }

        do {
            if (value >= bankNotes[index]) {
                value -= bankNotes[index];
                contNotes[index]++;
            } else {
                index++;
            }
        } while (value != 0);

        for (int i = 0; i < bankNotes.length; i++){
            if(contNotes[i] != 0){
                sb.append(String.format("Total de %d cédulas de R$%d\n", contNotes[i], bankNotes[i]));
            }
        }
        System.out.println(sb);


    }
}
