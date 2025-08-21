package ExerciciosOOP.ClassEx;

import org.w3c.dom.ls.LSOutput;

public class CalculadoraClass {

    public void sum(){
        System.out.println(10+ 2);
    }
    //Método sem parâmetros

    public void multiplication(int num1, float num2){
        System.out.println(num1 * num2);
    }
    //Método com parâmetros

    public double division(double num1, double num2){
        if (num2 == 0){
            System.out.println("ERROR: Divisões por 0(zero) não são permitidas");
            return 0;
        }
        return num1 / num2;
    } //Metodo com parametro e retorno

}
