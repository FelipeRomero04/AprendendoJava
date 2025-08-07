package Exercicios;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ex078 {
    public static void main(String[] args){
        Random generator = new Random();
        Map<String, Integer> scoreboard = new HashMap<>();


        for (int i = 1; i < 5; i++) {
            int value = generator.nextInt(1, 7);

            scoreboard.put("Jogador" + i, value);
            System.out.printf("O Jogador%d pegou o dado de valor %d\n", i, value);

        }

        Map<String, Integer> ordenedScoreboard = scoreboard.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (valorExistente, novoValor) -> valorExistente,
                        LinkedHashMap::new
                ));


        System.out.println("=".repeat(30));

        AtomicInteger rank = new AtomicInteger(1);
        ordenedScoreboard.forEach((player, dieValue) -> {
            System.out.printf("%dº%s tirou %d no dado\n", rank.getAndIncrement(),player, dieValue);
        });

    }
}
