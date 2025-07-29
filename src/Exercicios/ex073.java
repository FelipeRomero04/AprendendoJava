package Exercicios;

import java.util.Scanner;

public class ex073 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        int num;

        for (int i = 1; i < matriz.length + 1; i++) {
            for (int j = 1 ; j < matriz[i - 1].length + 1; j++){
                System.out.printf("Digite um valor para[%d, %d]: ", i, j);
                num = Integer.parseInt(input.nextLine());
                matriz[i - 1][j - 1] = num;
            }
        }

        for (int[] l : matriz) {
            for (int c : l) {
                System.out.printf("[ %s ]", c);
            }
            System.out.println();
        }
    }
}
