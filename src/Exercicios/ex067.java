package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex067 {
    public static void main(String[] args){
        //adicionar a lista, ordenar, imprimir o indice
        List<Integer> values = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int num = 0;
        for (int i = 0; i < 5; i++) {
            try {
                System.out.print("Digite um valor: ");
                num = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                System.out.println("ERROR: Valor inválido! Tente novamente.");
                i -= 1;
            }
            if (i == 0 || num > values.get(values.size() - 1)){
                values.add(num);
                System.out.println("Adicionado ao final");
                continue;
            }

            for (int j = 0; j < 5; j++) {
                if (num <= values.get(j) ){
                    values.add(j, num);
                    System.out.printf("Foi adicionado a posição %d ", j);
                    break;
                }
            }
        }
        System.out.println(values);


        //DAR UMA AJEITADA, COLOCAR \n nums lugar ai




    }
}



