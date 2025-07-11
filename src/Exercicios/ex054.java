package Exercicios;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ex054 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Double> values = new ArrayList<>();

        String line;
        double num = 0;
        int cont = 0;
        while(true){
            try {
                System.out.print("Digite um número[ENTER P/SAIR]: ");
                line = input.nextLine().replace(",",".");
                if (line.isEmpty()) {
                    break;
                }
                num = Double.parseDouble(line);
            }catch (Exception e){
                System.out.println("Somente números são permitidos nesse campo.");

            }
            values.add(num);
            cont++;
        }

        double sum = values.stream().mapToDouble(n -> n).sum();

        System.out.printf("Você digitou %d número e a soma dele é %.1f.", cont, sum);

    }

}
