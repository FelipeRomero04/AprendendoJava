package aulasOOP.classe01;

public class Estudante {
    public String name;
    public int age;
    public char sex;
    //Todos os atributos possuem um valor padrão, não precisando obrigatoriamente
    //inicializá-las.

    public void imprimirEstudante(){
        System.out.println("Nome: " + this.name + " Idade: "+ this.age + " Sexo" + this.sex);
        // this = Usado para referenciar o próprio objeto.
    }
}
