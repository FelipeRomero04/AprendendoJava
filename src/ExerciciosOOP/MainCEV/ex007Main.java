package ExerciciosOOP.MainCEV;

import java.util.Scanner;

import static ExerciciosOOP.ClassCEV.ex007Class.variablePrice;

public class ex007Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            variablePrice(input);
        }catch (NumberFormatException e){
            System.out.println("Valor inserido inválido.");
        }

    }
}
