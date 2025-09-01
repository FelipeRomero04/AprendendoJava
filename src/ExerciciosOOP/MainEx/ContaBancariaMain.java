package ExerciciosOOP.MainEx;

import ExerciciosOOP.ClassEx.ContaBancariaClass;

public class ContaBancariaMain {
    public static void main(String[] args) {
        ContaBancariaClass myBank = new ContaBancariaClass("Felipe", 3000);
        ContaBancariaClass myBank2 = new ContaBancariaClass("José", 2000);
        try{
            myBank.transferValue(myBank2, 5000);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        myBank2.printSale();
        myBank.printSale();


    }//Mandar pro chat avaliar
}
