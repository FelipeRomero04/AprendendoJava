package Exercicios;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class ex074 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        int num;
        int sumColumn = 0;
        int biggerValue = 0;
        int sumPair = 0;

        for (int i = 1; i < matriz.length + 1; i++) {
            for (int j = 1; j < matriz[i - 1].length + 1; j++) {
                System.out.printf("Digite o número da posição [%d, %d]: ", i, j);
                num = Integer.parseInt(input.nextLine());
                matriz[i - 1][j - 1] = num;

                if(matriz[i - 1][j - 1] % 2 == 0){
                    sumPair += num;
                }

                if (j == 3){
                    sumColumn += num;
                }
            }

            if(i == 2){
                OptionalInt line = Arrays.stream(matriz[i - 1]).max();
                if(line.isPresent()){
                    biggerValue = line.getAsInt();
                }
                //adicionar tratamento nesse ex e no anterior, deixar cod +clean
            }

        }


        for (int[] l : matriz){
            for(int c : l){
                System.out.printf("[ %d ]", c);
            }
            System.out.println();
        }

        System.out.printf("Soma dos números pares: %d\n", sumPair);
        System.out.printf("Soma dos valores da terceira coluna: %d\n", sumColumn);
        System.out.printf("Maior valor da segunda linha: %d", biggerValue);

    }
}
