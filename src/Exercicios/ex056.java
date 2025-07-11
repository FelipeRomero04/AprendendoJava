package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex056 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Double> values = new ArrayList<>();

        String line;
        String option;
        double num;
        int cont = 0;

        do{
            try{
                System.out.print("Digite um número: ");
                line = input.nextLine().replace(",", ".");
                num = Double.parseDouble(line);

                values.add(num);
                cont++;
            }catch (Exception e){
                System.out.println("Somente números são permitidos nesse campo.");
            }

            while (true){
                System.out.print("Deseja continuar[S/N]: ");
                option = input.nextLine().toUpperCase().substring(0, 1);

                if (option.equals("S") || option.equals("N")) {
                    break;
                }
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (!option.equals("N"));

        double sum = values.stream().mapToDouble(n -> n).sum();

        System.out.printf("A soma dos %d números é %.1f", cont, sum);

    }
}
