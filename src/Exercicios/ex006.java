package Exercicios;
import java.util.Scanner;

public class ex006 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = input.nextDouble();

        int valorInteiro = (int) valor;

        System.out.println(valorInteiro);


    }
}
