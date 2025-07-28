package Exercicios;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ex072_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<List<Integer>> values = new LinkedList<>();
        values.add(new LinkedList<>());
        values.add(new LinkedList<>());

        int num;
        for (int i = 1; i < 5; i++) {
            System.out.printf("Digite o %dº valor: ", i);
            try {
                num = Integer.parseInt(input.nextLine());
                if (num % 2 == 0) values.get(0).add(num);
                if (num % 2 == 1) values.get(1).add(num);
            }catch (Exception e){
                System.out.println("ERROR: Valor inválido, tente novamente.");
            }

        }

        if (values.get(0).isEmpty()){
            System.out.println("Nenhum valor par foi digitado.");
        }else{
            Collections.sort(values.get(0));
            System.out.printf("Os valores pares digitados foram: %s\n", values.get(0));
        }

        if(values.get(1).isEmpty()){
            System.out.println("Nenhum valor ímpar foi digitado.");

        }else{
            Collections.sort(values.get(1));
            System.out.printf("Os valores ímpares digitados foram: %s", values.get(1));
        }

    }
}
