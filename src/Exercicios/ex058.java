package Exercicios;

import java.util.Scanner;

public class ex058 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String option = "";

        int age;
        char sex;
        byte olderAgeCont = 0;
        byte manCont = 0;
        byte womanOlderCont = 0;
        do{
            System.out.println("-------- CADASTRE UMA PESSOA --------");

            System.out.print("Idade: ");
            try {
                String line = input.nextLine();
                age = Integer.parseInt(line);
                if(age < 0 || age > 150){
                    System.out.println("Idade inválida. Tente Novamente!");
                    continue;
                }

            }catch (Exception e){
                System.out.println("ERRO: Preencha o campo 'idade' novamente.");
                continue;
            }

            if (age > 18){
                olderAgeCont++;
            }

            while(true) {
                System.out.print("Sexo[M/F]: ");
                try{
                    sex = input.nextLine().toUpperCase().trim().charAt(0);
                    if (sex != 'M' && sex != 'F') {
                        System.out.println("Valor inválido. Tente novamente usando [M] ou [F]");
                        continue;
                    }
                }catch (Exception e){
                    System.out.println("O campo não pode estar vazio.");
                    continue;
                }
                break;
            }

            if(sex == 'M'){
                manCont++;
            }

            if (sex == 'F' && age < 20){
                womanOlderCont++;
            }

            while (true) {
                System.out.print("Quer continuar[S/N]: ");
                option = input.nextLine().toUpperCase().trim();
                if (option.isEmpty() || !option.equals("S") && !option.equals("N") &&
                !option.equals("SIM") && !option.equals("NAO")) {
                    System.out.println("Opção inválida.");
                    break;
                }
                break;

            }

        }while (!option.equals("N"));

        System.out.printf("\nTotal de pessoas com mais de 18 anos: %d\nAo todo temos %d homem(ns) cadastrado(s)\nE temos %d mulher(es) com menos de 20 anos.",
                olderAgeCont, manCont, womanOlderCont);
    }
}
