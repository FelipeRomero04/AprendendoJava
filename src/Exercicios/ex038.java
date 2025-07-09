package Exercicios;


import java.util.List;



public class ex038 {
    public static void main(String[] args){
        List<Integer> listValues = List.of(3, 8, 15, 2, 10, 7);

        int listValuesUpdate = listValues.stream()
                               .filter(n -> n < 10)
                               .mapToInt(n -> n * 2)
                               .sum();

        System.out.println(listValuesUpdate);
    }
}
