package Exercicios;

import java.util.*;

public class ex046 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Integer> ageData = new HashMap<>();
        Map.Entry<String, Integer> maior = null;
        String name;
        int age;
        char sex;
        double average = 0;
        byte contF = 0;

        for (int i = 1; i < 4; i++) {
            System.out.printf("-- %dª PESSOA --\n", i);

            System.out.print("Nome: ");
            name = input.nextLine();

            while (true) {
                try {
                    System.out.print("Idade: ");
                    age = Integer.parseInt(input.nextLine().trim());
                    if (age < 0 || age > 130) {
                        System.out.println("Por favor, preencha o campo 'Idade' corretamente!");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("ERRO! Idade inserida inválida.");
                }
            }

            ageData.put(name, age);

            OptionalDouble line = ageData.values().stream().mapToDouble(Integer::doubleValue).average();
            if (line.isPresent()) {
                average = line.getAsDouble();
            }

            while (true) {
                System.out.print("Sexo[M/F]: ");
                sex = input.nextLine().toUpperCase().charAt(0);
                if (sex == 'F' && age < 20) {
                    contF++;
                    break;
                } else if (sex == 'M' || sex == 'F') {
                    break;
                }
                System.out.println("Valor inválido. Tente Novamente.");

            }

            if (sex == 'M') {
                maior = Collections.max(ageData.entrySet(), Map.Entry.comparingByValue());

            }
        }

        System.out.printf("A média de idade do grupo é de %.2f\n", average);
        System.out.println((maior != null) ? "O homem mais velho tem "+maior.getValue()+ " anos e seu nome é "+maior.getKey(): "Não à nenhum homem no sistema" );
        System.out.printf("Ao todo tem %d mulher(es) com menos de 20 anos", contF);
    }
}
//COPIAR SOBRE HASHMAP URGENTEEEEEEEEEEE




