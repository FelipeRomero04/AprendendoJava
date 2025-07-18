package Exercicios;

import java.util.*;

public class ex065 {
    public static void main(String[] args){
        List<Integer> values = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int num = 0;

        for (int i = 1; i < 6 ; i++) {
            System.out.printf("Digite um valor na posição %d: ", i);
            try{
                num = Integer.parseInt(input.nextLine());
            }catch (Exception e){
                System.out.println("ERROR: Um caractere inválido foi encontrado! Tente novamente.");
            }
            values.add(num);
        }
        System.out.printf("Você digitou os valores %d: ", values.toArray());

        int bigger = Collections.max(values);
        System.out.printf("O menor valor digitado foi %d nas posições ", bigger);

        for(int j : values) {
            if (j == bigger) {
                System.out.printf("%d...", values.indexOf(j));
            }
        }


        int smaller = Collections.min(values);
        System.out.printf("\nO menor valor digitado foi %d nas posições \n", smaller);

        for(int j : values) {
            if (j == smaller) {
                System.out.printf("%d...", values.indexOf(j));
            }
        }
    }
}
//ARRUMAR TUDO FIZ MERDA SIFUDE