package Exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ex078 {
    public static void main(String[] args){
        Random generator = new Random();
        Map<String, Integer> scoreboard = new HashMap<>();


        for (int i = 0; i < 4; i++) {
            int value = generator.nextInt(1, 7);

            scoreboard.put("Jogador" + i, value);
            scoreboard.forEach((chave, valor) -> System.out.printf("%s tirou %d no dado.\n", chave, valor));

        }
//        System.out.println(scoreboard);
//        scoreboard.forEach((player, dieValue) -> {
//            System.out.printf("%s tirou %d no dado\n", player, dieValue);
//
//
//
//        });

    }
}
