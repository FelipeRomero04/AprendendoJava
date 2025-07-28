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
            String name = input.nextLine().trim();

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
                    if (weight > 0 && weight < 400){
                        break;
                    }
                    System.out.println("Peso negativo ou inválido. Informe o peso novamente.");

                }catch (Exception e){
                    System.out.println("ERROR: Tente novamente.");
                }
            }

            users.add(name);
            users.add(String.valueOf(weight));
            date.add(new ArrayList<>(users));  //Cria uma nova lista com os valores de users

            while(true){
                System.out.print("Quer continuar[S/N]: ");
                option = input.nextLine().trim().toUpperCase();
                if (validOptions.contains(option)){
                    break;
                }
                System.out.print("Opção inválida.");
            }


        }while(!(option.charAt(0) == 'N'));


        double maxWeight = Double.parseDouble(date.get(0).get(1));
        double minWeight = Double.parseDouble((date.get(0).get(1)));

        for (List<String> list : date) {

            double line = Double.parseDouble(list.get(1));

            if (maxWeight <= line){
                maxWeight = line;
            }
            if (line <= minWeight){
                minWeight = line;
            }

        }

        System.out.printf("O maior peso foi de %.1fKg. Peso de ", maxWeight);

        for (List<String> user : date) {
            String weightUserMax = user.get(1);
            String nameUserMax = user.get(0);
            if (Double.parseDouble(weightUserMax) == maxWeight) {
                System.out.printf("[%s] ", nameUserMax);
            }

        }

        System.out.printf("\nO menor peso foi de %.1fKg. Peso de ", minWeight);

        for (List<String> user : date){
            String weightUserMin = user.get(1);
            String nameUserMin = user.get(0);
            if (Double.parseDouble(weightUserMin) == minWeight){
                System.out.printf("[%s] ",nameUserMin);
            }

        }

    }
}

