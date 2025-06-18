package Exercicios;
import java.util.Scanner;

public class ex005 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Primeira nota do aluno: ");
        float notaum = input.nextFloat();

        System.out.print("Segunda nota do aluno: ");
        float notadois = input.nextFloat();

        float media = (notaum + notadois) / 2;

        System.out.printf("A média entre %.2f e %.2f, é de %.2f", notaum, notadois, media);
    }
}
