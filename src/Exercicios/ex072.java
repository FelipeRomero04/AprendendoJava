package Exercicios;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class ex072 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> values = new LinkedList<>();

        int num;
        for (int i = 0; i < 4; i++) {
            try {
                System.out.print("Digite um valor: ");
                num = Integer.parseInt(input.nextLine());
                values.add(num);
            }catch (Exception e){
                System.out.println("ERROR: Valor inválido, tente novamente!");
            }
        }

        List<Integer> pair = values.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .toList();
        if(pair.isEmpty()){
            System.out.println("Nenhum valor par foi digitado.");
        }else{
            System.out.printf("Os valores pares digitados foram: %s\n", pair);
        }

        List<Integer> odd = values.stream()
                .filter(n -> n % 2 == 1)
                .sorted()
                .toList();
        if (odd.isEmpty()){
            System.out.println("Nenhum valor ímpar foi digitado.");
        }else{
            System.out.printf("Os valores ímpares digitados foram: %s", odd);
        }



    }
}

//Tentar criar dar um add em uma instancia com o valor de um stream par