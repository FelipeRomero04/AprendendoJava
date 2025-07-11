package Exercicios;

import java.util.*;

public class ex055 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Double> values = new ArrayList<>();

        String line;
        double num;
        String option;
        int cont = 0;

        do {
            try {
                System.out.print("Digite um número: ");
                line = input.nextLine().replace(",", ".");
                num = Double.parseDouble(line);

                values.add(num);
                cont++;

            } catch (Exception e) {
                System.out.println("Somente número são válido nesse campo.");
            }

            while (true) {
                System.out.print("Deseja continuar[S/N]: ");
                option = input.nextLine().toUpperCase().substring(0, 1);
                if (option.equals("S") || option.equals("N")) {
                    break;
                }
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (!option.equals("N"));

        OptionalDouble lineAverage = values.stream().mapToDouble(n -> n).average();
        double average = 0;
        if(lineAverage.isPresent()){
            average = lineAverage.getAsDouble();
        }

        double max = (!values.isEmpty()) ? Collections.max(values): 0;
        double min = (!values.isEmpty()) ? Collections.min(values): 0;

        System.out.printf("Você digitou %d números e a média foi %.1f\nO maior valor foi %.1f e o menor valor foi %.1f",
                cont, average, max, min );

    }
}
