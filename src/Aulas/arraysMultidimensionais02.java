package Aulas;

import java.util.Arrays;

public class arraysMultidimensionais02 {
    public static void main(String[] args){

        //Outra maneira de atribuir valores
        int[][] matriz = new int[3][];

        matriz[0] = new int[]{1,2,3}; //referencia 0 terá um array de taman 3
        matriz[1] = new int[2]; //referencia 1 terá array de tamanh 2
        matriz[2] = new int[3];

        //Outra maneira

        int[][] matriz2 = {{0, 0}, {1, 2, 3}, {4, 5, 6}};

        System.out.println(Arrays.toString(matriz[0]));


    }
}
