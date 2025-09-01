package ExerciciosOOP.ClassCEV;

public class ex002Class {

    public static void printRecord(String ...name){

        String namePlayer = name[0];
        if (name.length > 2){
            System.out.println("Apenas 2 argumentos são suportados.");
            return;
        }
        if (name[0].isEmpty() || !name[0].matches("[A-Za-z\\s]+")){
            System.out.println("Jogador " + "'"+namePlayer +"'"+ " não foi encontrado.");
            namePlayer = "<desconhecido>";
        }

        int gols;

        try{
            gols = Integer.parseInt(name[1]);
        }catch (NumberFormatException e){
            System.out.println("Quantidade de gols não foi informada corretamente.");

            gols = 0;
        }
        System.out.println("-".repeat(50));
        System.out.println("O jogador " + namePlayer + " marcou " + gols + " gols.");
        System.out.println("-".repeat(50));

    }

}
