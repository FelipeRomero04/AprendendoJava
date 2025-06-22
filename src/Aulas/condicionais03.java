package Aulas;

import java.util.Scanner;

public class condicionais03 {
    public static void main(String[] args){

        double salario = 6000;
        String doar = (salario >= 8000) ? "Vou doar":"Não vou doar";

        //System.out.println(doar);

        //Exemplos com Ternario com condições compostas(não recomendado
        Scanner input = new Scanner(System.in);
        System.out.print("Idade: ");
        int idade = input.nextInt();

        String categoria = (idade <= 12) ? "Categoria Infantil" : (idade <= 15) ? "Categoria Juvenil" : "Categoria Adulta";

        System.out.println(categoria);
    }
}
