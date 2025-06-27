package Aulas;

public class Repeat {
    public static void main(String[] args){

        double valueMax = 50_000;

        for (int i = (int)valueMax; i >= 1; i--){
            double valueParcel = valueMax / i;
            if(valueParcel < 1000){
                continue;
            }
            System.out.printf("Parcela: %d Valor: %.2f\n",i,valueParcel);
        }

    }
}
