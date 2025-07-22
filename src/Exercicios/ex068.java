package Exercicios;

import java.util.*;

public class ex068 {
    public static void main(String[] args){
        List<Integer> values = new LinkedList<>();
        Set<String> validOptions = Set.of("N", "NÃO", "NAO", "S", "SIM");
        Scanner input = new Scanner(System.in);

        String option = " ";

        do {
            int num;

            try {
                System.out.print("Digite um número: ");
                num = Integer.parseInt(input.nextLine().trim());
                values.add(num);
            } catch (Exception e) {
                System.out.println("ERROR: Entrada inválida! Digite novamente.");
                continue;
            }

            while (true) {
                System.out.print("Quer continuar[S/N]: ");
                option = input.nextLine().toUpperCase().trim();
                if (validOptions.contains(option)) {
                    break;
                }
                System.out.println("Opção não encontrada. Tente novamente!");
            }

        }while(!(option.charAt(0) == 'N'));

        System.out.printf("Você digitou %d elementos.\n", values.size());

        values.sort(Collections.reverseOrder());
        System.out.printf("Os valores em ordem decrescente são %s\n", values);

        System.out.printf("O valor 5 %s",  (values.contains(5)) ? "foi encontrado na lista\n": "não foi encontrado na lista\n");

    }
}
