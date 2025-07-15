package Exercicios;

import java.util.*;

public class ex059 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Double> stock = new HashMap<>();
        Set<String> validOptions = Set.of("N", "NÃO", "NAO", "S", "SIM");

        String nameProduct;
        String option = "";
        double valueProduct;
        int biggerThousand = 0;

        do {
            System.out.print("Nome do produto: ");
            nameProduct = input.nextLine();
            boolean isSymbol = false;
            for (char ch : nameProduct.toCharArray()) {
                if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                    isSymbol = true;
                    break;
                }
            }

            if (isSymbol) {
                System.out.println("ERROR: Não são permitidos símbolos ou n no nome do produto.");
                continue;
            }

            while (true) {
                System.out.print("Preço: R$ ");
                String line = input.nextLine();
                try {
                    valueProduct = Double.parseDouble(line);
                    if (valueProduct < 0) {
                        System.out.println("Valor inválido! Tente Novamente.");
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println("ERRO: Não foi possível adicionar esse produto.");
                    continue;
                }
                break;
            }

            if (valueProduct > 1000) {
                biggerThousand++;
            }

            stock.put(nameProduct, valueProduct);

            while (true) {
                System.out.print("Quer continuar[S/N]: ");
                option = input.nextLine().toUpperCase().trim();

                if (!validOptions.contains(option)) {
                    System.out.print("Valor inválido.");
                    continue;
                }
                break;

            }
        } while (!option.equals("N"));

        double total = stock.values().stream().mapToDouble(n -> n).sum();
        Map.Entry<String, Double> cheap = Collections.min(stock.entrySet(), Map.Entry.comparingByValue());

        System.out.printf("Total da compra : R$%.2f\nProdutos custando mais de R$1000: %d\nO produto mais barato foi a %s custando R$%.2f",
                total, biggerThousand, cheap.getKey(),cheap.getValue());


    }
}
