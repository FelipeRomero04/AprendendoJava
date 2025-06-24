package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ex019 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> comparador = new ArrayList<>();
        int valor;

        for(int i = 1; i < 4; i++){
            System.out.printf("Digite o %dº número: ", i);
            valor = input.nextByte();
            comparador.add(valor);
        }

        int maior = Collections.max(comparador);
        int menor = Collections.min(comparador);

        System.out.printf("O maior valor digitado é %d\nO menor valor digitado é %d", maior, menor);
    }
}
