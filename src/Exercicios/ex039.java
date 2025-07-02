package Exercicios;

import java.util.List;
import java.util.OptionalDouble;

public class ex039 {
    public static void main(String[] args){
        List<Integer> listValues = List.of(3, 8, 15, 2, 10, 7, 25);

        OptionalDouble listValuesUpdate = listValues.stream()
                .filter(n -> n > 5 && n < 20)
                .mapToInt(Integer::intValue)
                .filter(n -> n % 2 == 1)
                .average();

        if (listValuesUpdate.isPresent())
            System.out.println(listValuesUpdate.getAsDouble());
    }
}
