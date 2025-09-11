package ExerciciosOOP.MainCEV;

import ExerciciosOOP.ClassCEV.ex008Class;

import java.util.Scanner;

public class ex008Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ex008Class coin = new ex008Class();

        try {
            double price = Double.parseDouble(input.nextLine());
            System.out.println("O dobro de "+ coin.formatedPrice(price, "R$")+" é "+ coin.halfPrice(price, true));

        }catch (NumberFormatException e){
            System.out.println("Entrada inválida!");
        }




    }
}
