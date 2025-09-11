package ExerciciosOOP.MainCEV;

import ExerciciosOOP.ClassCEV.ex006Class;
import java.time.LocalDate;

import java.util.Scanner;

public class ex006Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ex006Class dateBirth = new ex006Class();

        try {
            LocalDate yearBirth = dateBirth.yearBirth(input);
            dateBirth.validVote(yearBirth);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
