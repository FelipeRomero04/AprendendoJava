package Exercicios;

import java.util.Scanner;
import java.time.Year;

public class ex044 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int yearCurrent = Year.now().getValue();
        int ofAge = 0;
        int underAge = 0;
        int birth;

        for (int i = 1; i < 4; i++) {
            while(true) {
                try {
                    System.out.printf("Em que ano a %dª pessoa nasceu? ", i);
                    birth = input.nextInt();
                    if (birth > yearCurrent || birth < 1500){
                        System.out.println("Preencha o campo acima com o ano de nascimento correto.");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Valor Inválido. Tente novamente!");
                    input.nextLine();
                }
            }
            if(yearCurrent - birth >= 18){
                ofAge++;
                continue;
            }
            underAge++;
        }
        System.out.printf("Ao todo tivemos %d pessoa(s) ao todo Maior De Idade\nE também %d pessoa(s) Menor De Idade",
                ofAge, underAge);
    }
}
