package ExerciciosOOP.ClassEx;

import java.util.Scanner;

public class ContaBancariaClass {
    private final String holder;
    private double sale;


    public ContaBancariaClass(String holder, double sale) {
        this.holder = holder;
        this.sale = sale;
    }

    private void validateWithDraw(double value){
        if(value < 0) {
            throw new IllegalArgumentException("Transação Inválida. Não foi possível realizar o saque.");
        }
    }

    private void validateDeposit(double value){
        if(value < 0 || value > this.sale){
            throw new IllegalArgumentException("Saldo insuficiente. Transação negada.");
        }
    }

    public void depositValue(double value) {
        validateDeposit(value);
        this.sale += value;
        System.out.println("A Transferência no valor de R$" + value + " foi concluído.");

    }

    public void withDraw(double value) {
        validateWithDraw(value);
        this.sale -= value;
        System.out.println("Transferência no valor de R$" + value + " Foi concluído.");
    }

    public void transferValue(ContaBancariaClass adress, double value){
        validateDeposit(value);
        this.sale -= value;
        adress.sale += value;

        System.out.println("Transação bem-sucedida de " + this.holder + " para " + adress.holder);
    }

    public void printSale() {
        System.out.println("O saldo de " + holder + " é de: R$" + sale);
    }
}

//Posteriormente tentar fazer um crud nesse exercício.