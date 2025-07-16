package Exercicios;

import java.util.Scanner;

public class ex061 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] numberWords =
                {"Zero", "Um", "Dois", "Três", "Quatro", "Cinco",
                "Seis", "Sete", "Oito", "Nove", "Dez", "Onze",
                "Doze", "Treze", "Quatorze", "Quinze", "Dezesseis",
                "Dezessete", "Dezoito", "Dezenove", "Vinte"};

        int num;

        while(true){
            System.out.print("Digite um número de 0 a 20: ");
            String line = input.nextLine();
            try{
                num = Integer.parseInt(line);
                if (num < 0 || num > 20){
                    System.out.print("Tente Novamente.");
                    continue;
                }
            }catch (Exception e){
                System.out.println("ERROR: Preencha o campo novamente...");
                continue;
            }
            break;
        }

        System.out.printf("Você digitou o número %s.", numberWords[num]);


    }
}
