package Exercicios;
import java.util.Scanner;

public class ex017 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Insira seu salário: €");
        double salarioAnual = input.nextDouble();
        input.close();

        double valorTaxa1 = salarioAnual * 9.7 / 100;
        double valorTaxa2 = salarioAnual * 37.35 / 100;
        double valorTaxa3 = salarioAnual * 49.50 / 100;
        double taxaAPagar;

        if (salarioAnual <= 34712){
            taxaAPagar = valorTaxa1;
        }
        else if (salarioAnual <= 68.507){
            taxaAPagar = valorTaxa2;
        }
        else{
            taxaAPagar =valorTaxa3;
        }

        System.out.printf("O valor total dos impostos a pagar são de: €%.2f\n", taxaAPagar);
    }
}
