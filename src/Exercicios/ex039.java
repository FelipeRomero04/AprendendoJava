package Exercicios;

import java.awt.*;
import java.util.List;

public class ex039 {
    public static void main(String[] args){
        List<Integer> listValues = List.of(3, 8, 15, 2, 10, 7, 25);

        int listValuesUpdate = listValues.stream()
                .filter(n -> n > 5 && n < 20)
                .map(n % 2 == 1 ->)

    }
}
