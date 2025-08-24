package ExerciciosOOP.ClassEx;

import java.util.Arrays;

import java.util.Scanner;

public class FuncionarioClass {

    public String name;
    public int age;
    public double[] wages;

    public void readWage(){
        Scanner input = new Scanner(System.in);
       if (this.wages == null || this.wages.length == 0){
           System.out.println("Salários não foram definidos. Iniciando padrão de 3 meses...");
           this.wages = new double[3];
       }

        for (int i = 0; i < this.wages.length; i++) {
            System.out.print(i + 1 + "º Mês: ");
            try {
                this.wages[i] = Double.parseDouble(input.nextLine());
            }catch (Exception e){
                System.out.println("Valor inválido! Será considerado 0.");
                this.wages[i] = 0;
            }
        }

    }

    public double averageWage(double[] wage){
        return Arrays.stream(wage).average().orElse(0);
    }

    public void print(){
        double average = averageWage(this.wages);

        System.out.println("=".repeat(30));
        System.out.printf("Nome : %s\nIdade: %d\nSalários: ", this.name, this.age);
        for(double wage : this.wages){
            System.out.print("(R$" + wage + ") ");
        }
        System.out.printf("\nMédia: R$%.2f", average);
    }

}
