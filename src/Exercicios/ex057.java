package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class ex057 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random generator = new Random();

        int machine;
        int user;
        int sum;
        short wins = 0;

        while (true){
            machine = generator.nextInt(1, 11);
            System.out.print("Escolha PAR ou ÍMPAR[P/I]: ");
            String option = input.nextLine().toUpperCase().trim().substring(0,1);

            if (!option.equals("P") && !option.equals("I")){
                System.out.println("Valor inserido no campo acima é inválido.");
                continue;
            }

            while(true){
                try{
                    System.out.print("Escolha um número de 1 a 10: ");
                    String line = input.nextLine();
                    user = Integer.parseInt(line);
                    if (user >= 0 && user < 11){
                        break;
                    }
                    System.out.println("Valor Inválido! Escolha um valor de 1 a 10");


                }catch (Exception e){
                    System.out.println("ERRO: Preencha o campo novamente.");
                }
            }

            sum = user + machine;
            String isPar = (sum % 2 == 0) ? "PAR":"ÍMPAR";

            System.out.printf("Você jogou %d e o computador %d. total de %d DEU %s\n", user, machine, sum, isPar);

            if (sum % 2 == 0 && option.equals("P") || sum % 2 == 1 && option.equals("I")){
                System.out.println("Você VENCEU!\nVamos jogar novamente.");
                wins++;
            }else{
                break;
            }
        }

        System.out.printf("VOCÊ PERDEU! Total de vitórias: %d\n", wins);
    }
}
