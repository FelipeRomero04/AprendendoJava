package ExerciciosOOP.ClassCEV;

import java.util.Scanner;

public class ex007Class {
    public static void variablePrice(Scanner input){
        System.out.print("Digite o preço: ");
        double price = Double.parseDouble(input.nextLine());
        double halfPrice = price / 2;
        double doublePrice = price * 2;
        double tenPercentPrice = price + (price * 0.1);

        System.out.println("A metade é "+halfPrice+"\nO dobro é "+doublePrice+"\n10% a mais é "+tenPercentPrice);

    }
}
