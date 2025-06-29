package Exercicios;

import java.util.Scanner;

public class ex032 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Valor da compra: ");
        double price = input.nextDouble();

        System.out.print("Escolhe um Método de pagameto\n[ 1 ]à vista\n[ 2 ]Cartão\n[ 3 ]2x Cartão\n[ 4 ]3x ou mais\n");

        System.out.print("Opção: ");
        int paymentMethods = input.nextInt();

        double finalprice = switch (paymentMethods){
            case 1 -> price - (price * 0.10);
            case 2 -> price - (price * 0.05);
            case 4 -> price + (price * 0.20);
            default -> price;
        };

        if (paymentMethods == 4){
            System.out.print("Quantidade de parcelas: ");
            byte howManyParcel = input.nextByte();
            double valueparcel = finalprice / howManyParcel;
            System.out.printf("Sua compra será parcelada em %dx de R$%.2f COM JUROS\n", howManyParcel, valueparcel);
        }

        System.out.printf("Sua compra de R$%.2f vai custar R$%.2f no final.", price, finalprice);

    }

}
