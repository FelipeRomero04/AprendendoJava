package Exercicios;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int num = input.nextInt();


        int sucessor = num + 1;
        int antecessor = num - 1;
        input.close();

        System.out.printf("Analisando o valor %d, o seu sucessor é %d, e seu antecessor é %d", num, sucessor, antecessor);
    }
}
