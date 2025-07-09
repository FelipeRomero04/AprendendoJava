package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ex049 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Double> values = new ArrayList<>();

        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();
        input.nextLine();

        values.add(num1);
        values.add(num2);

        String line;
        int option;

        while (true) {
            System.out.println("\nMENU:\n[1] Somar\n[2] Multiplicar\n[3] Maior\n[4]Novos números\n[5]Sair do Programa");
            System.out.print("Opções: ");
            line = input.nextLine();
            try{
                option = Integer.parseInt(line);
                if (option > 5){
                    System.out.println("Opção inválida. Tente novamente...");
                    continue;
                }
            }catch (Exception e){
                System.out.println("ERRO: Por favor, preencha o campo corretamente.");
                continue;
            }
            if(option == 1){
                double sum = values.stream().mapToDouble(n -> n).sum();
                System.out.printf("A soma dos números %.1f + %.1f = %.1f\n", num1, num2, sum);
            }else if(option == 2){
                double product = num1 * num2;
                System.out.printf("O produto de %.1f x %.1f = %.1f\n", num1, num2, product);
            } else if (option == 3) {
                double bigger = Collections.max(values);
                System.out.printf("Entre %.1f e %.1f o maior é %.1f\n", num1, num2, bigger);
            }


        }

    }
}
