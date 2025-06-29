package Aulas;

public class RepeatStructure {
    public static void main(String[] args){

        double valueMax = 50_000;
        //For
//        for (int i = (int)valueMax; i >= 1; i--){
//            double valueParcel = valueMax / i;
//            if(valueParcel < 1000){
//                continue;
//            }
//            System.out.printf("Parcela: %d Valor: %.2f\n",i,valueParcel);
//        }

        //While
        int cont = (int)valueMax;
        while (cont > 1) {
            double valueParcel = valueMax/cont;
            --cont;
            if (valueParcel < 1000){
                continue;
            }

            System.out.printf("Parcela: %d Valor: %.2f\n",cont,valueParcel);
        }

        do {
            System.out.println("oii");
            cont--;
        }while (cont > 5);
    }
}
