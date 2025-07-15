package Exercicios;

import java.util.Scanner;

public class ex060 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Criar um array, decrementado o valor o maximo possivel , e quando n der
        // o referenciador e incrementado passando para a proxima cedula

        int[] banknotes = {50, 20, 10, 1};

        int contFifty = 0;
        int contTwenty = 0;
        int contTen = 0;
        int cont = 0;
        int index = 0;
        System.out.println("Valor do saque: ");
        int value = input.nextInt();

        for (int i = 0; i < banknotes.length; i++){
            if (value > banknotes[index]){
                value -= banknotes[index];
            }else{
                index++;
            }

        }

        //PROVAVELMENTE PASSAR ISSO PRO UM WHILE, PENSAR SE DEVE COLOCAS OS CONT EM
        // UMA LISTA TBM.

    }
}
