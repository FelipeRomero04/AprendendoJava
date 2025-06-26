package Exercicios;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ex028 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Double> triangle = new ArrayList<>();

        int repeat = 0;
        String typeTriangle;

        for(int i = 0; i < 4; i++){
            System.out.printf("%dº segmento: ", i);
            double segment = input.nextDouble();

            if(triangle.contains(segment)){
                ++repeat;
            }
            triangle.add(segment);
        }

        if (triangle.get(0) + triangle.get(1) > triangle.get(2) &&
            triangle.get(1) + triangle.get(2) > triangle.get(0) &&
            triangle.get(2) + triangle.get(0) > triangle.get(1)){

            typeTriangle = switch (repeat){
                case 1 -> "Isósceles";
                case 2 -> "Equilátero";
                default -> "Escaleno";
            };

            System.out.printf("Os segmentos acima podem formar um triangulo %s", typeTriangle);
            System.exit(0);
        }

        System.out.print("Os segmento acima não formam nenhum Triângulo.");





    }
}
