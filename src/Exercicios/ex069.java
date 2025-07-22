package Exercicios;

import java.util.*;

public class ex069 {
    public static void main(String[] args){
        List<Integer> values = new LinkedList<>();
        Set<String> validOptions = Set.of("NÃO", "NAO", "N", "S", "SIM");
        Scanner input = new Scanner(System.in);

        String option = " ";

        do{
            int num;
            try {
                System.out.print("Digite um número: ");
                num = Integer.parseInt(input.nextLine());
                values.add(num);
            }catch (Exception e){
                System.out.println("ERROR: Entrada inválida. Tente novamente!");
                continue;
            }

            while(true){
                System.out.print("Quer continuar[S/N]: ");
                option = input.nextLine().trim().toUpperCase();
                if (validOptions.contains(option)){
                    break;
                }
                System.out.println("Opção inexistente! Digite de novo.");
            }

        }while(!(option.charAt(0) == 'N'));

        List<Integer> pair = values.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        List<Integer> odd = values.stream()
                .filter(n -> n % 2 == 1)
                .toList();

        System.out.println("A lista completa é " + values);
        System.out.println("A lista de pares é " + pair);
        System.out.println("A lista de ímpar é " + odd);

    }
}
