package Exercicios;

import java.time.Year;
import java.util.Scanner;

public class ex025 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Ano de nascimento: ");
        short yearBirth = input.nextShort();

        int year = Year.now().getValue();
        int old = year - yearBirth;

        int timeToEnlist;
        int yearToEnlist;

        System.out.printf("Quem nasceu em %d tem %d anos de idade em %d.\n", yearBirth, old, year);
        if (old < 18){
            timeToEnlist = 18 - old;
            yearToEnlist = year + timeToEnlist;
            System.out.printf("Ainda faltam %d ano(s) para seu alistamento\nSeu alistamento será em %d.",timeToEnlist, yearToEnlist);
        } else if (old > 18) {
            timeToEnlist = old - 18;
            yearToEnlist = year - timeToEnlist;
            System.out.printf("Você ja deveria ter se alistado há %d ano(s)\nSeu alistamento foi em %d",timeToEnlist, yearToEnlist);
        } else {
            System.out.print("Você tem que se alistar imediatamente.");
        }


    }
}
