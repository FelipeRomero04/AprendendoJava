package Exercicios;

import java.util.ArrayList;
import java.util.Random;

public class ex007 {
    public static void main(String[] args){
        ArrayList<String> nomes = new ArrayList<>();
        Random gerador = new Random();
        //Não aprendi o for vou fazer manualmente

        nomes.add("Maria");
        nomes.add("Vanessa");
        nomes.add("Felipe");
        nomes.add("Marcos");

        int sorteado = gerador.nextInt(4);
        String escolhido = nomes.get(sorteado);

        System.out.printf("O aluno(a) escolhido(a) foi: %s", escolhido);





    }
}
