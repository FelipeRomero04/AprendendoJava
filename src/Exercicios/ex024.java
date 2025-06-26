package Exercicios;

import java.util.Scanner;

public class ex024 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        float num1 = input.nextFloat();
        System.out.println("Digite o segundo valor: ");
        float num2 = input.nextFloat();

        String isBiggerOrSmaller;
        if (num1 > num2){
            isBiggerOrSmaller = "O primeiro valor é maior.";
        }else if(num2 > num1){
            isBiggerOrSmaller = "O segundo valor é maior.";
        }else{
            isBiggerOrSmaller = "Os valores são iguais.";
        }

        System.out.println(isBiggerOrSmaller);

    }
}
