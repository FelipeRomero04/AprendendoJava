package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ex045 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Double> weightList = new ArrayList<>();
        double weight = 0;

        for (int i = 1; i < 4; i++) {
            System.out.printf("Peso da %dª pessoa: ",i);
            String line = input.nextLine().trim().replace(",", ".");
            try {
                weight = Double.parseDouble(line);
                if (weight < 0) {
                    System.out.println("O peso informado não é aceitável! Informe os pesos novamente.");
                    System.exit(0);
                }
            }catch (Exception e){
                System.out.println("ERRO: Valores inválidos reinicie o programa.");
                System.exit(0);
            }
            weightList.add(weight);
        }
        double greaterWeight = Collections.max(weightList);
        double lowerWeight =Collections.min(weightList);

        System.out.printf("O maior peso lido foi %.2fKg\nO menor peso lido foi %.2fKg",
                greaterWeight, lowerWeight);

    }
}

/*
Como o valor de weight esta sendo convertido, não é necessário limpar o buffer,
já que caso algum valor invalido(letras,símbolos...) seja inserido, a conversão não sera feita
e o nextLine não deixa \n pra trás



 */