package Exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex077 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Map<String, Double> studentStatus = new HashMap<>();

        System.out.print("Nome: ");
        String name = input.nextLine();

        System.out.print("Média: ");
        double average = input.nextDouble();

        String status = "APROVADO";
        if (average < 5) status = "REPROVADO";
        else status = "RECUPERAÇÃO";

        studentStatus.put(name, average);


        System.out.printf("- Name is %s\n -Average is %.1f", name, studentStatus.get(name));


    }
}
