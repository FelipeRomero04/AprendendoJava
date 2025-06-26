package Exercicios;

import java.time.Year;
import java.util.Scanner;

public class ex027 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Ano de nascimento: ");
        short yearOfBirth = input.nextShort();

        int yearCurrent = Year.now().getValue();
        int old = yearCurrent - yearOfBirth;
        String category = "";

        if(old <= 9){
          category = "MIRIM";
        }
        else if(old <= 14){
            category = "INFANTIL";
            
        } else if (old <= 19) {
            category = "JUNIOR";
            
        } else if (old <= 25) {
            category = "SÊNIOR";
            
        }

        System.out.printf("O atleta tem %d anos.\nClassificação: %s", old, category);

    }

}
