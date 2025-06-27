package Exercicios;

public class ex031 {
    public static void main(String[] args){
        double valuecar = 43000;
        int amountparcel = 1;
        double valueparcel = 0;

        while(true){
            valueparcel = valuecar / amountparcel;
            if (valueparcel <= 1000){
                break;
            }
            amountparcel++;
            System.out.printf("Parcela: %d Valor: %.2f\n", amountparcel, valueparcel);
        }


    }
}
