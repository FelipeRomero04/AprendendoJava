package Exercicios;

import java.util.*;
import java.util.stream.Collectors;

public class ex066 {
    public static void main(String[] args){
        List<Integer> values = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Set<String> validOptions = Set.of("NAO", "N", "NÃO", "SIM", "S");

        int num;
        String option;

        do{
            try {
                System.out.print("Digite um número: ");
                num = Integer.parseInt(input.nextLine());
                if (!values.contains(num)){
                    values.add(num);
                }else {
                    System.out.println("Valores duplicados serão desconsiderados pelo sistema.");
                }
            }catch (Exception e){
                System.out.println("ERROR: Valores inválidos! Tente novamente...");
            }
            while(true) {
                System.out.print("Quer continuar[S/N]: ");
                option = input.nextLine().toUpperCase().trim();
                if(validOptions.contains(option)){
                    break;
                }
                System.out.println("Opção inexistente. Tente de novo!");
            }
        }while(!(option.charAt(0) == 'N'));

        values = values.stream().sorted().collect(Collectors.toList());
        System.out.println("Voce digitou os valores" + values);
    }
}
