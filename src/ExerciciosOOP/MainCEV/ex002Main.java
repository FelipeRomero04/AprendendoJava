package ExerciciosOOP.MainCEV;

import java.util.Scanner;

import static ExerciciosOOP.ClassCEV.ex002Class.printRecord;

public class ex002Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Nome do jogador: ");
        String name = input.nextLine();
        System.out.print("Quantidade de gols: ");
        String gols = input.nextLine();

        printRecord(name, gols);


    }
}
