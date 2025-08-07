package Exercicios;


import java.time.LocalDate;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class ex079 {
    public static void main(String[] args){
        Map<String, String> dates;
        Scanner input = new Scanner(System.in);
        LocalDate yearNow = LocalDate.now();


        System.out.print("Nome: ");
        String name = input.nextLine();

        System.out.print("Ano de Nascimento: ");
        int yearOfBirth = Integer.parseInt(input.nextLine());

        System.out.print("Carteira de Trabalho: ");
        String workCardNum = input.nextLine();

        String age = String.valueOf(yearNow.getYear() - yearOfBirth);

        if (workCardNum.equals("0")){
            dates = new LinkedHashMap<>(Map.of(
                    "Nome", name,
                    "Idade", age,
                    "Carteira de Trabalho", workCardNum));

            dates.forEach((k, v) -> System.out.printf("%s tem o valor %s\n", k, v));

        }else{
            System.out.print("Ano de contratação: ");
            int yearOfHire = Integer.parseInt(input.nextLine());
            // ano de contração tem que ser até 18 anos dps do nascimento, validar

            System.out.print("Salário: ");
            String wage = String.valueOf(input.nextDouble());

            String retirementAge = String.valueOf((yearOfHire - yearOfBirth) + 35);

            dates = new LinkedHashMap<>(Map.of(
                    "Nome", name,
                    "Idade", age,
                    "Carteira de Trabalho", workCardNum,
                    "Contratação", String.valueOf(yearOfHire),
                    "Salário" ,wage,
                    "Aposentadoria", retirementAge
            ));

            dates.forEach((k, v) -> System.out.printf("%s tem o valor de %s\n", k, v));

        }

    }
}
