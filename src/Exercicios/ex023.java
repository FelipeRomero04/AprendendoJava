package Exercicios;

import java.util.Scanner;

public class ex023 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int value = input.nextInt();

        System.out.print("Converter em : [1]Binário [2]Hexadecimal [3]Octal\nOpção: ");
        byte option = input.nextByte();

        String valueBinary = Integer.toBinaryString(value);
        String valueHex = Integer.toHexString(value);
        String valueOct = Integer.toOctalString(value);

        String valueConverted = switch(option){
            case 1 -> "O valor "+value+" em binário é "+valueBinary;
            case 2 -> "O valor "+value+" em Hexadecimal é "+valueHex;
            case 3 -> "O valor "+value+ " em Octal é "+valueOct;
            default -> "Opção Inválida! Tente novamente.";
        };
        System.out.println(valueConverted);
    }
}


