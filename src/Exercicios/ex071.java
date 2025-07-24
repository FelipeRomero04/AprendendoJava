package Exercicios;

import java.util.*;

public class ex071 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Set<String> validOptions = Set.of("NÃO", "NAO", "N", "SIM", "S");
        List<List<String>> date = new LinkedList<>();
        List<String> users = new LinkedList<>();

        String option = " ";
        do{
            users.clear();

            System.out.print("Digite seu nome: ");
            String name = input.nextLine();

            boolean hasDigit = false;
            for (char l : name.toCharArray())
                if (Character.isDigit(l)){
                    hasDigit = true;
                    break;
                }
            if (hasDigit){
                System.out.println("Não são permitidos dígitos nesse campo.");
                continue;
            }

            double weight;

            while(true) {
                try {
                    System.out.print("Digite seu peso: ");
                    weight = Double.parseDouble(input.nextLine());
                    if (weight > 0){
                        break;
                    }
                    System.out.println("Peso negativo. Informe o peso novamente.");

                }catch (Exception e){
                    System.out.println("ERROR: Tente novamente.");
                }
            }

            users.add(name);
            users.add(String.valueOf(weight));

            while(true){
                System.out.print("Quer continuar[S/N]: ");
                option = input.nextLine().trim().toUpperCase();
                if (validOptions.contains(option)){
                    break;
                }
                System.out.print("Opção inválida.");
            }

        }while(!(option.charAt(0) == 'N'));

        System.out.println(date);
    }
}




//[[pedro, 50], [julia, 56], [Robson, 87]

//if [i][1] == max
//sout ...
