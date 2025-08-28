package ExerciciosOOP.MainEx;

import ExerciciosOOP.ClassEx.ProdutoClass;

public class ProdutoMain {
    public static void main(String[] args){
        ProdutoClass product = new ProdutoClass();

        product.name = "Papel Higiênico";
        product.price = 12.99;
        product.amount = 200;

        System.out.println("Valor total do estoque de Papel Higiênico: R$" + product.totalPrice(product.price, product.amount));
    }
}
