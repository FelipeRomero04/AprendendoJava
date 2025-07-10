package Exercicios;

import java.util.Scanner;

public class ex053 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int terms = input.nextInt();

        int f1 = 0;
        int f2 = 1;
        int total = 0;

        while(terms != 0){
            System.out.printf("%d -> ", f1);

            total = f1 + f2;
            f1 = f2;
            f2 = total;

        // TENTAR ENTENDER DE VEZ!!! A IMPORTANCIA DA ORDEM
            terms--;
        }
        System.out.println("FIM");


    }
}
