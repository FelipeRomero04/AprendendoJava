package Aulas;

public class Aula02 {
    public static void main(String[] args){
        byte idade = 18;
        short numeroPequeno = (int) 2000; // exemplo de casting
        int numero = 32000;
        long numeroGrande = 310000;
        float salarioFloat = 3200.0F;
        double salarioDouble = 233344.2D;
        char caractere = 86; // De acordo com a table ASCII ou Unicode
        String nome = "Felipe";
        String format = String.format("Meu nome: %s\nIdade: %d\nSalário: %.2f", nome, idade, salarioFloat);

        System.out.println(format);

    }
}
