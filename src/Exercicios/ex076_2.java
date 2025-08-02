package Exercicios;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ex076_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Set<String> validOptions = Set.of("NÃO", "NAO", "N", "SIM", "S");
        Map<String, List<Double>> dates = new HashMap<>();

        String option;

        do{
            System.out.print("Digite seu nome: ");
            String name = input.nextLine().trim().toUpperCase();
            for(char l : name.toCharArray()){
                if(Character.isDigit(l)){
                    System.out.println("Um nome não pode conter números!");
                   return;
                }
            }

            System.out.print("Nota 1: ");
            double nt1 = Double.parseDouble(input.nextLine());

            System.out.print("Nota 2: ");
            double nt2 = Double.parseDouble(input.nextLine());

            dates.put(name, new ArrayList<>(Arrays.asList(nt1, nt2)));

            while(true) {
                System.out.print("Quer continuar[S/N]: ");
                option = input.nextLine().toUpperCase().trim();
                if (validOptions.contains(option)){
                    break;
                }
                System.out.println("Opção inválida!");
            }

        }while(!(option.charAt(0) == 'N'));

        System.out.println(dates);

        AtomicInteger cont = new AtomicInteger(1);

        while (true) {
            System.out.println("No.\t\t Nome\t\t Média");

            dates.forEach((name, grade) -> {
                OptionalDouble line = grade.stream().mapToDouble(n -> n).average();
                double averageGrade = 0;
                if(line.isPresent()){
                    averageGrade = line.getAsDouble();
                }
                System.out.printf("%s\t\t %s\t\t %.1f\n",cont, name, averageGrade);
                cont.getAndIncrement();

            });
            cont.set(1);
            String student;
            try {
                System.out.print(">>Visualizar Notas\nNome do aluno: ");
                student = input.nextLine().trim().toUpperCase();//tratar não pode números
                if (student.isEmpty()){
                    break;
                }
                if (!dates.containsKey(student)){
                    System.out.println("Aluno não cadastrado no sistema.");
                    continue;
                }
                System.out.printf("Notas do aluno %s são: %s\n", student, dates.get(student));

            }catch (Exception e){
                System.out.println("ERROR: Entrada inválida, tente novamente");
            }
            System.out.println("=".repeat(40));


        }


    }
}
// criar um hash com id, if id == num: mostra nome

//continuar tratando valores, tentar refazer cm lista de dict, copiar sobre foreach em MAP e tudo novo, e sobre threads