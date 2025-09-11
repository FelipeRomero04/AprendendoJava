package ExerciciosOOP.ClassCEV;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ex006Class {

    public LocalDate yearBirth(Scanner input){
        DateTimeFormatter formatted = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Data de nascimento: ");
        String yearOfBirth = input.nextLine().replaceAll("\\D", "/");

        if(yearOfBirth.matches("(\\d{4})/(\\d{2})/(\\d{2})")){
            yearOfBirth = yearOfBirth.replaceFirst("(\\d{4})/(\\d{2})/(\\d{2})", "$3/$2/$1");
        } else if (!yearOfBirth.matches("(\\d{2})/(\\d{2})/(\\d{4})")){
            throw new IllegalArgumentException("A data inserida precisa estar no formato(dd/mm/yyyy).");
        }

        return LocalDate.parse(yearOfBirth, formatted);
    }

    public void validVote(LocalDate birth){
        int age = Period.between(birth, LocalDate.now()).getYears();

        System.out.print("Com "+age+" anos: ");
        if(age >= 18 && age <= 75){
            System.out.println("VOTO OBRIGATÓRIO.");
        } else if (age < 16) {
            System.out.println("NÃO PODE VOTAR");
        }  else{
            System.out.println("VOTO OPCIONAL.");
        }

    }
}
