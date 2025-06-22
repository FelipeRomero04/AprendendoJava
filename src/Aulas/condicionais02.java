package Aulas;

public class condicionais02 {
    public static void main(String[] args){

        int idade = 15;
        String categoria; //Em java var podem ser declaradas sem atrib valor

        if (idade <= 12){
            categoria = "Categoria Infantil";
        }
        else if (idade <= 18){
            categoria = "Categoria Juvenil";
        }
        else{
            categoria = "Categoria Adulto";
        }

        System.out.println(categoria);
    }
}
