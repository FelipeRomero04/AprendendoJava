package Exercicios;

import java.util.Scanner;

public class ex047 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char sex;

        System.out.print("Informe seu sexo[M/F]: ");
        sex = input.nextLine().toUpperCase().charAt(0);

        while (sex != 'M' && sex != 'F'){
        System.out.print("Dados Inválido. Por favor, informe seu sexo: ");
        sex = input.nextLine().toUpperCase().charAt(0);

    }
        System.out.printf("Sexo %s registrado...", sex);
    }
}
