package Aulas;

public class condicionais {
    public static void main(String[] args){
        int idade = 15;
        boolean maioridade = idade >= 18;

        if(maioridade = true){  // É possivel usar atribuição na condicão
            System.out.println("Naosei");
        }

        if(maioridade){
            System.out.println("Não liberado beber!");

        }else{
            System.out.println("Liberado beber!");
        }

        if(!maioridade){
            System.out.println("Liberador beber!");
        }
    }
}
