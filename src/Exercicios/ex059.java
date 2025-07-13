package Exercicios;

import java.util.*;

public class ex059 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Map<String, Double> values = new HashMap<>();
        Set<String> validOptions = Set.of("N","NÃO","NAO", "S", "SIM");

        String nameProduct;
        String option;
        double valueProduct;

        do{
            System.out.print("Nome do produto: ");
            nameProduct = input.nextLine();

            System.out.print("Preço: R$ ");
            valueProduct = input.nextDouble();

            values.put(nameProduct, valueProduct);

            while(true){
                System.out.print("Quer continuar[S/N]: ");
                option = input.nextLine().toUpperCase().trim();

                if (!validOptions.contains(option)){
                    System.out.print("Valor inválido.");
                    continue;
                }
                break;

            }
        }while(option.charAt(0) != 'N');


    }
}
