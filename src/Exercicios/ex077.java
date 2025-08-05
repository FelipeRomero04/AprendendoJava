package Exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex077 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Map<String, String> studentStatus = new HashMap<>();

        System.out.print("Nome: ");
        String name = input.nextLine();

        System.out.print("Média: ");
        double average = input.nextDouble();

        String status = "APROVADO";
        if (average < 5) status = "REPROVADO";
        else if (average < 7 ) status = "RECUPERAÇÃO";

        studentStatus.put(name, String.valueOf(average));
        studentStatus.put("Status", status);



        System.out.printf(" - Name is %s\n - Average is %s\n - Situation: %s" , name, String.join("",studentStatus.get(name)), studentStatus.get("Status"));


    }

}
