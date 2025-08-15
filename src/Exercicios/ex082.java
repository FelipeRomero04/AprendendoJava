package Exercicios;

import java.util.*;

public class ex082 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Map<String, String>> playerStatistic = new LinkedList<>();
        Set<String> validOptions = Set.of("NÃO, NAO, N, SIM, S");

        String option;
        do{
            System.out.print("Nome do jogador: ");
            String namePlayer = input.nextLine();

            System.out.printf("Quantas partidas %s jogou: \n", namePlayer);
            int HowManyMatches = Integer.parseInt(input.nextLine());

            List<Integer> listGols = new LinkedList<>();
            for (int i = 1; i < HowManyMatches; i++) {
                System.out.printf("Quantos gols na %dº partida:  ", i);
                int gols = Integer.parseInt(input.nextLine());
                listGols.add(gols);
            }
            Map<String, String> players = new LinkedHashMap<>();
            players.put("Nome", namePlayer);
            players.put("Gols", listGols.toString());
            players.put("Total", String.valueOf(listGols.stream().mapToInt(n -> n).sum()));

            while(true){
                System.out.print("Quer continuar[S/N]: ");
                option = input.nextLine();
                if(validOptions.contains(option)){
                    break;
                }
                System.out.println("Insira uma opção válida!");
            }


        }while(!(option.charAt(0) == 'N'));
    }
}
