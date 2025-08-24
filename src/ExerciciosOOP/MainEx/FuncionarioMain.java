package ExerciciosOOP.MainEx;

import ExerciciosOOP.ClassEx.FuncionarioClass;

import java.util.Scanner;

public class FuncionarioMain {
    public static void main(String[] args) {
        FuncionarioClass employee = new FuncionarioClass();

        employee.name = "Jose";
        employee.age = 23;
//        employee.wages = new double[3];

        employee.readWage();
        employee.print();

    }
}
