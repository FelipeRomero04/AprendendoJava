package Exercicios;

import java.util.Scanner;

public class ex026 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Nota do primeiro aluno: ");
        double firstStudent = input.nextDouble();
        System.out.print("Nota do secundo aluno: ");
        double secondStudent = input.nextDouble();

        double average = (firstStudent + secondStudent) / 2;
        String situationStudent;

        if(average >= 7){
            situationStudent = "Aluno Aprovado";
        }else if(average > 5 && average < 6.9){
            situationStudent = "Aluno em Recuperação";
        }else{
            situationStudent = "Aluno Reprovado";
        }

        System.out.printf("Tirando %.1f e %.1f, a media do aluno é %.1f\n%s",firstStudent, secondStudent, average, situationStudent);
    }
}
