package Exercicios;

import java.util.*;

public class ex081 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<String> validOptions = Set.of("N", "NÃO", "NAO", "SIM", "S");
        List<Map<String, String>> data = new ArrayList<>();

        double totAge = 0;
        String option;

        do {
            System.out.print("Nome: ");
            String name = input.nextLine();

            String sex;
            while (true) {
                System.out.print("Sexo[F/M]: ");
                sex = input.nextLine().toUpperCase().substring(0, 1);
                if (!sex.equals("F") && !sex.equals("M")) {
                    System.out.println("Preencha o campo corretamente...");
                    continue;
                }
                break;
            }

            int age;
            while (true) {
                try {
                    System.out.print("Idade: ");
                    age = Integer.parseInt(input.nextLine());
                    if (age < 0 || age > 150) {
                        System.out.println("A idade podem não ser verídica, preencha novamente.");
                        continue;
                    }
                    totAge += age;
                    break;
                } catch (Exception e) {
                    System.out.println("ERROR: insira os dados corretamente.");
                }
            }
            Map<String,String> mapTemp = new LinkedHashMap<>();
            mapTemp.put("Nome", name);
            mapTemp.put("Sexo", sex);
            mapTemp.put("Idade", String.valueOf(age));

            data.add(mapTemp);

            while (true) {
                System.out.print("Quer continuar[S/N]: ");
                option = input.nextLine().trim().toUpperCase();
                if (!validOptions.contains(option)) {
                    System.out.println("Opção inválida. Tente Novamente!");
                    continue;
                }
                break;
            }

        } while (!(option.charAt(0) == 'N'));

        System.out.printf("A) Ao todo temos %d pessoas cadastradas.\n", data.size());

        double average = totAge / data.size();
        System.out.printf("B) A média de idades é de %.2f anos\n", average);


        List<String> hasWoman = data.stream()
                .filter(user -> user.get("Sexo").equals("F"))
                .map(user -> user.get("Nome"))
                .toList();

        if(hasWoman.isEmpty()){
            System.out.print("C) Nenhum mulher foi cadastrada.");
        }else{
            System.out.println("C) As Mulheres cadastradas foram "+String.join(", ", hasWoman));
        }

        System.out.println("D) Lista de pessoas acima da média: ");

        for(Map<String,String> user : data){
            if (Integer.parseInt(user.get("Idade")) > average){
                user.forEach((k, v) -> System.out.printf(" %s = %s ;", k, v ));
                System.out.println();
            }
        }

    }
}
