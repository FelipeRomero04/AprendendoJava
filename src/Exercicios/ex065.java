package Exercicios;

import java.util.*;

public class ex065 {
    public static void main(String[] args){
        List<Integer> values = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int num;

        for (int i = 1; i < 5 ; i++) {
            System.out.printf("Digite um valor na posição %d: ", i);
            try{
                num = Integer.parseInt(input.nextLine());
                values.add(num);
            }catch (Exception e){
                System.out.println("ERROR: Um numero inválido foi desconsiderado pelo sistema.");
            }

        }
        System.out.printf("Você digitou os valores: %s\n", values);

        int bigger = Collections.max(values);
        System.out.printf("O maior valor digitado foi %d nas posições ", bigger);

        for(int j = 0; j < values.size(); j++) {
            if (values.get(j) == bigger) {
                System.out.printf("%d...", j);
            }
        }

        int smaller = Collections.min(values);
        System.out.printf("\nO menor valor digitado foi %d nas posições ", smaller);

        for(int j = 0; j < values.size(); j++) {
            if (values.get(j) == smaller) {
                System.out.printf("%d...", j);
            }
        }
    }
}
