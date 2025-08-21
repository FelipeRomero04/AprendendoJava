package ExerciciosOOP.MainEx;

import ExerciciosOOP.ClassEx.CalculadoraClass;

public class CalculadoraMain {
    public static void main(String[] args){
        CalculadoraClass calculator = new CalculadoraClass();

        calculator.sum();
        calculator.multiplication(2, 7);

        double resultDivision = calculator.division(10, 0);
        System.out.println(resultDivision);
    }
}
