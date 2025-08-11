package Exercicios;

import java.time.LocalDate;

import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ex079 {
    public static void main(String[] args){
        Map<String, String> dataUser = new LinkedHashMap<>();
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = LocalDate.now().format(formatter);

        System.out.print("Nome: ");
        String name = input.nextLine().trim();
        if(!name.matches("^[a-zA-z\\s]+$")){
            System.out.println("'Nome' contem caracteres inválidos. Tente novamente!");
            return;
        }

        System.out.print("Ano de Nascimento: ");
        String line = input.nextLine().trim();

        int yearBirth;
        int yearNow;
        String age;

        try {
            LocalDate dateBirth = LocalDate.parse(line.trim(), formatter); //formatter e a forma que o java deve ler a data, e não a converter para esse formato
            LocalDate dateNowFormated = LocalDate.parse(date, formatter);
            age = String.valueOf(Period.between(dateBirth, dateNowFormated).getYears());

            yearBirth = dateBirth.getYear();
            yearNow = dateNowFormated.getYear();

        }catch (Exception e){
            System.out.println("Formato da data inválido! Considere: dd/mm/yyyy");
            return;
        }

        if (yearBirth > yearNow || Integer.parseInt(age) > 120 || Integer.parseInt(age) < 0){
            System.out.println("ERRO: Ano da Nascimento incorreto. Verifique novamente!");
            return;
        }
        if (Integer.parseInt(age) < 14){
            System.out.println("Não são permitidos usuários menores de 14 anos ter carteira de trabalho.");
            return;
        }

        System.out.print("Carteira de Trabalho: ");
        String workCardNum = input.nextLine();

        if(!workCardNum.matches("(\\d{3})\\.(\\d{3})\\.(\\d{3})-(\\d{2})")){
            System.out.println("ERRO: Formato do CPF é inválido");
            return;
        }

        if (workCardNum.equals("0")){
            dataUser.put("Nome", name);
            dataUser.put("Idade", age);
            dataUser.put("Carteira de Trabalho", workCardNum);

            dataUser.forEach((k, v) -> System.out.printf("%s tem o valor %s\n", k, v));

        }else{

            System.out.print("Ano de contratação: ");
            int yearOfHire = Integer.parseInt(input.nextLine());

            if (yearOfHire < yearBirth ||
                    yearOfHire > yearNow ||
                    Integer.parseInt(age) > 80) {

                System.out.println("ERRO: Dados inválidos. O ano de contratação ou a idade estão incorretos.");
                return;

            }

            System.out.print("Salário: ");
            String wage = String.valueOf(input.nextDouble());

            String retirementAge = String.valueOf((yearOfHire - yearBirth) + 35);

            dataUser.put("Nome", name);
            dataUser.put("Idade", age);
            dataUser.put("Carteira de Trabalho", workCardNum);
            dataUser.put("Ano de Contratação", String.valueOf(yearOfHire));
            dataUser.put("Salário", wage);
            dataUser.put("Aposentadoria", retirementAge);

            dataUser.forEach((k, v) -> System.out.printf("%s tem o valor de %s\n", k, v));
        }
    }

}

// ver sobre o ::

