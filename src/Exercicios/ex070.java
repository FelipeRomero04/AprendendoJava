package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ex070 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<String> expressionSplit = new ArrayList<>();

        System.out.print("Digite uma expressão: ");
        String expression = input.nextLine();

        for(char ch : expression.toCharArray()){
            expressionSplit.add(String.valueOf(ch));
        }

        try {
            int countParentheses1 = Collections.frequency(expressionSplit, "(");
            int countParentheses2 = Collections.frequency(expressionSplit, ")");
            if (countParentheses1 - countParentheses2 == 0){
                System.out.println("Sua expressão está correta.");
            }else{
                System.out.println("Sua expressão está incorreta.");
            }
        }catch (Exception e){
            System.out.println("A expressão precisa conter parênteses!");
        }

    }
}

