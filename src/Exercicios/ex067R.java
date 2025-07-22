package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex067R {
    public static void main(String[] args){
        List<Integer> values = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int num;

        for(int i = 0; i < 5; i++){
            try{
                System.out.print("Digite um número: ");
                num = Integer.parseInt(input.nextLine());
            }catch (Exception e){
                System.out.println("ERROR: Valor inválido. Tente novamente!");
                i--;
                continue;
            }

            if (i == 0 || num > values.get(values.size() - 1)){
                System.out.println("Adicionado ao final da lista");
                values.add(num);
                continue;
            }

            for(int j = 0; j < values.size(); j++){
                if (num < values.get(j)){
                    values.add(j, num);
                    System.out.printf("Adicionando na posição %d da lista\n", j);
                    break;
                }
            }
        }

        System.out.println(values);

    }
}

