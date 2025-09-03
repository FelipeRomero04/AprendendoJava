package ExerciciosOOP.MainCEV;

import ExerciciosOOP.ClassCEV.ex006Class;
import java.time.LocalDate;

import java.util.Scanner;

public class ex006Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ex006Class dateBirth = new ex006Class();
        LocalDate yearBirth = dateBirth.yearBirth(input);

        dateBirth.validVote(yearBirth);

    }
}
//Pegar o grupo e validar os dias e meses