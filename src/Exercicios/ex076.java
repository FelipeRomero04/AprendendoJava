package Exercicios;

import java.util.*;

import static java.util.Arrays.asList;

public class ex076 {
    public static void main(String[] args){
        //[claudio,[10,5]]
        Scanner input = new Scanner(System.in);
        List<Object> dates = new LinkedList<>();
        Set<String> validOptions = Set.of("SIM", "S", "NÃO", "NAO", "N");

        String option;

        do{
            System.out.print("Nome: ");
            String name = input.nextLine();

            System.out.print("Nota 1: ");
            double nt1 = Double.parseDouble(input.nextLine());

            System.out.print("Nota 2: ");
            double nt2 = Double.parseDouble(input.nextLine());

            dates.add(name);
            dates.add(asList(nt1, nt2));

            while(true) {
                System.out.print("Quer continuar[S/N]: ");
                option = input.nextLine().toUpperCase().trim();
                if(validOptions.contains(option)){
                    break;
                }
                System.out.println("Opção Inválida.");
            }
        } while(!(option.charAt(0) == 'N'));

        System.out.println(dates);


        for (int i = 0; i < dates.size(); i++) {
            OptionalDouble line = dates.stream().mapToDouble(n -> (double) n).average();
            double average = 0;
            if (line.isPresent()){
                average = line.getAsDouble();
            }
            System.out.println(average);
        }

    }
}

//media provavel for