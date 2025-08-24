package ExerciciosOOP.MainEx;

import ExerciciosOOP.ClassEx.CalculadoraClass;

public class CalculadoraMain {
    public static void main(String[] args){
        CalculadoraClass calculator = new CalculadoraClass();

        calculator.sum();
        calculator.multiplication(2, 7);

        double resultDivision = calculator.division(10, 0);
        System.out.println(resultDivision);

        int sum = calculator.sumAll(1,2,3,4,5,6,7);
        System.out.println(sum);
    }
}
