package Exercicios;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ex007 {
    public static void main(String[] args){
        List<String> nomes = new ArrayList<>(Arrays.asList("Maria", "Vanessa", "Marcos", "Felipe"));
        //Adicionando diretamente
        Random gerador = new Random();
        //Não aprendi o for vou fazer manualmente

        /*nomes.add("Maria");
        nomes.add("Vanessa");
        nomes.add("Felipe");
        nomes.add("Marcos");*/

        int sorteado = gerador.nextInt(4);
        String escolhido = nomes.get(sorteado);

        System.out.printf("O aluno(a) escolhido(a) foi: %s", escolhido);





    }
}
