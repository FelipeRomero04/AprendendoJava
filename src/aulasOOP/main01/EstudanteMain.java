package aulasOOP.main01;

import aulasOOP.classe01.Estudante;

public class EstudanteMain {
    public static void main(String[] args){
        Estudante estudante = new Estudante(); //Criando variável de referência do tipo estudante.
        //Instanciando um objeto do tipo estudante.

        estudante.name = "Julio";
        estudante.age = 23;
        estudante.sex = 'M';

        estudante.imprimirEstudante();


    }
}
