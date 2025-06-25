package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex021 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Double> triangle = new ArrayList<>();

        for (byte i = 1; i < 3; i++){
            System.out.printf("%dª segmento: ", i);
            double stright = input.nextDouble();
            triangle.add(stright);
        }
        double reta1 = triangle.get(0),
               reta2 = triangle.get(1),
               reta3 = triangle.get(2);

        if ((reta1 + reta2 > reta3) && (reta2 + reta3 > reta1) && (reta1 + reta3 > reta2)){
            // A soma de 2 retas deve ser menor que a 3 reta
            System.out.println("Os segmento acima PODEM FORMAR UM TRIÂNGULO");
        }
        else {
            System.out.println("Os segmento acima NÃO PODEM FORMAR UM TRIÂNGULO");
        }
    }
}
