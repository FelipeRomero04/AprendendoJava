package Exercicios;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ex062 {
    public static void main(String[] args){
        List<String> clubs = Arrays.asList("Palmeiras", "Flamengo", "Internacional", "Grêmio", "São Paulo",
                "Atlético-MG", "Atlético-PR", "Cruzeiro", "Botafogo", "Santos",
                "Bahia", "Fluminense", "Corinthians", "Chapecoense", "Ceará",
                "Vasco", "Sport", "América-MG", "Vitória", "Paraná");

        System.out.printf("Lista do BRASILEIRÃO: %s\n\n", clubs);

        System.out.printf("Os 5 primeiros colocados são %s\n\n", clubs.subList(0,6));

        System.out.printf("Os 4 últimos colocados são %s\n\n", clubs.subList(clubs.size() - 4, clubs.size()));

        List<String> clubsSorted = clubs.stream().sorted().toList();
        System.out.printf("Times em ordem alfabética: %s\n\n", clubsSorted);

        System.out.printf("A chapecoense está na %dº posição do campeonato", clubs.indexOf("Chapecoense") + 1);

    }
}
