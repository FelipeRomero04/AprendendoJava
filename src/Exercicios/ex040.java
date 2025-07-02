package Exercicios;

import java.util.List;
import java.util.OptionalDouble;

public class ex040 {
    public static void main(String[] args){
        List<Integer> values = List.of(3, 8, 15, 2, 10, 7, 25);
        List<Integer> valueInRange = values.stream()
                .filter(n -> n > 5 && n < 20)
                .toList();

        int valuesOddSum = valueInRange.stream()
                .filter(n -> n % 2 == 1)
                .mapToInt(n -> n)
                .sum();

        OptionalDouble averageValues = valueInRange.stream()
                .mapToInt(n -> n)
                .average();

        System.out.printf("Valores na faixa: %s\nSoma dos números ímpares: %d\nMedia: %s"
                ,valueInRange, valuesOddSum, (averageValues.isPresent() ? averageValues.getAsDouble(): "N/A"));
    }
}
