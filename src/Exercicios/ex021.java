package Exercicios;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex021 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> storage = new ArrayList<>();
        for(byte i = 0; i < 3; i++){
            System.out.printf("%dº reta: ", i);
            int stright = input.nextInt();
            storage.add(stright);
        }

        if (storage.get(0) + storage.get(1) < storage.get(2)){
            // A soma de 2 retas deve ser menor que a 3 reta

        }
    }
}
