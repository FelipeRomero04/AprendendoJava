package Exercicios;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ex062 {
    public static void main(String[] args){
        String[] clubs = {
                "Palmeiras", "Flamengo", "Internacional", "Grêmio", "São Paulo",
                "Atlético-MG", "Atlético-PR", "Cruzeiro", "Botafogo", "Santos",
                "Bahia", "Fluminense", "Corinthians", "Chapecoense", "Ceará",
                "Vasco", "Sport", "América-MG", "Vitória", "Paraná"};

        String[] clubsOrdenado = Arrays.stream(clubs).sorted().toArray(String[]::new);
        //VER Q PORRA ESSA N ENTENDI NADA

        System.out.printf("Lista do BRASILEIRÃO: %s", Arrays.toString(clubs));

        Arrays.sort(clubs);
        System.out.println("Times em ordem alfabética");

    }
}
