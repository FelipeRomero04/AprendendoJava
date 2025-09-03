package ExerciciosOOP.ClassCEV;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ex005Class {
    public List<Integer> ListRandomValue(Random generator){
        List<Integer> listValues = new LinkedList<>();
        System.out.print("Valores sorteados : ");
        for (int i = 0; i < 5; i++) {
            int num = generator.nextInt(1, 11);
            System.out.print(num + " ");
            listValues.add(generator.nextInt(1, 11));
        }
        System.out.println();
        return listValues;
    }

    public int sumPair(List<Integer> list){
        return list.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .sum();
    }
}
