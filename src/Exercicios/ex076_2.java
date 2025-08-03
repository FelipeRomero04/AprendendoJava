package Exercicios;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ex076_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Set<String> validOptions = Set.of("NÃO", "NAO", "N", "SIM", "S");
        Map<String, List<Double>> dates = new HashMap<>();

        String option = "SIM";

        do{
            boolean hasDigit = false;
            
            System.out.print("Digite seu nome: ");
            String name = input.nextLine().trim().toUpperCase();
            if (dates.containsKey(name)){
                System.out.printf("Já existe um %s cadastrado. Adicione o seu sobrenome\n", name);
                continue;
            }
            for(char l : name.toCharArray()){
                if(Character.isDigit(l)){
                    System.out.println("Um nome não pode conter números!");
                    hasDigit = true;
                    break;
                }
            }
            if (hasDigit){
                continue;
            }

            try{
                System.out.print("Nota 1: ");
                double nt1 = Double.parseDouble(input.nextLine());

                System.out.print("Nota 2: ");
                double nt2 = Double.parseDouble(input.nextLine());
                
                if (nt1 > 10 || nt1 < 0 || nt2 > 10 || nt2 < 0) {
                    System.out.println("Notas devem ter o valor de 0 á 10.");
                    continue;
                }

                dates.put(name, new ArrayList<>(Arrays.asList(nt1, nt2)));

            }catch(Exception e){
                System.out.println("ERROR: Entrada inválida, finalizando sistema.");
                return;
            }
            
            while(true) {
                System.out.print("Quer continuar[S/N]: ");
                option = input.nextLine().toUpperCase().trim();
                if (validOptions.contains(option)){
                    break;
                }
                System.out.println("Opção inválida!");
            }

        }while(!(option.charAt(0) == 'N'));

        AtomicInteger cont = new AtomicInteger(1);

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

        while (true) {
            String student;

            try {
                System.out.print(">>Visualizar Notas\nNome do aluno: ");
                student = input.nextLine().trim().toUpperCase();

                if (student.isEmpty()){
                    return;
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
