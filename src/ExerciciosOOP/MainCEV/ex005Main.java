package ExerciciosOOP.MainCEV;

import ExerciciosOOP.ClassCEV.ex005Class;
import java.util.List;
import java.util.Random;

public class ex005Main {
    public static void main(String[] args) {
        Random generator = new Random();
        ex005Class sumPairObject = new ex005Class();

        List<Integer> listRandom = sumPairObject.ListRandomValue(generator);
        int sumPair = sumPairObject.sumPair(listRandom);

        System.out.println("A soma dos valores pares da lista é "+ sumPair+ ".");

    }
}
