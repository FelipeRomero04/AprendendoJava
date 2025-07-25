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



        double maxWeight = 0;
        double minWeight = 0;

        for (int i = 0; i < date.size(); i++) {  //Tenta substituir esse lixo por um foreach

            if(i == 0){
                maxWeight = Double.parseDouble(date.get(0).get(1));

                minWeight = Double.parseDouble(date.get(0).get(1));
                continue;
            }
            for (int j = 1; j < date.get(i).size(); j++){
                double line = Double.parseDouble(date.get(i).get(j));

                if (maxWeight <= line){
                    maxWeight = line;
                }
                if (line <= minWeight){
                    minWeight = line;
                }

            }
        }

        System.out.printf("O maior peso foi de %.1fKg. Peso de ", maxWeight);

        for (List<String> user : date) {
            String weightUserMax = user.get(1);
            String nameUserMax = user.get(0);
            if (weightUserMax.equals(String.valueOf(maxWeight))) {
                System.out.printf("[%s] ", nameUserMax);
            }

        }

        System.out.printf("\nO menor peso foi de %.1fKg. Peso de ", minWeight);

        for (List<String> user : date){
            String weightUserMin = user.get(1);
            String nameUserMin = user.get(0);
            if (weightUserMin.equals(String.valueOf(minWeight))){
                System.out.printf("[%s] ",nameUserMin);
            }

        }

    }
}

