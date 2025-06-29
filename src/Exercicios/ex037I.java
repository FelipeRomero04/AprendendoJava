package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex037I {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> valuesPair = new ArrayList<>();

        for (int i = 1; i < 7; i++) {
            System.out.printf("%dº valor: ", i);
            int num = input.nextInt();
            valuesPair.add((num % 2 == 0) ? num:0);
        }
        int sum = valuesPair.stream().mapToInt(Integer::intValue).sum();
        System.out.printf("A soma do valores pares é %d", sum);
    }
}


/*
EXPLICAÇÃO DO SUM

lista.stream() - Cria um Stream da lista.
Transforma a lista e um fluxo de dados n1 -> n2 -> n3 -> ...

.mapToInt/Double/Long(Integer::intValue) - Faz a conversão dos objeto que estão na list(lidos como inteiros)
para valores primitivos(int, long, double)

.sum() - soma todos os elementos do intStream





 */