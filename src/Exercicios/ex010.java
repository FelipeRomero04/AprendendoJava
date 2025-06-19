package Exercicios;

import java.util.Scanner;

public class ex010 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Em que cidade você nasceu? ");
        String city = input.nextLine().toLowerCase().trim();

        boolean haveSanto = city.substring(0,5).contains("santo");

        System.out.println(haveSanto);
    }
}
