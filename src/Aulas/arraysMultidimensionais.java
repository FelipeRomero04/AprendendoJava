package Aulas;

import java.util.Arrays;

public class arraysMultidimensionais {
    public static void main(String[] args){

        int[][] numbers = new int[3][3];
        //Retorna o endereço de memória

        //Formas de atribuir valores
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;

        numbers[1][0] = 4;
        numbers[1][1] = 5;
        numbers[1][2] = 6;

//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers[i].length; j++) {
//                System.out.printf("%d ", numbers[i][j]);
//
//            }
//            System.out.println();
//        }
        //Usando foreach

//        for (int[] i : numbers){
//            for(int j : i){
//                System.out.printf("%d ", j);
//            }
//        }

        System.out.println(Arrays.toString(numbers[0]));


    }
}
