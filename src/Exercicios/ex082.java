package Exercicios;

import java.util.*;

public class ex082 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Map<String, String>> playerStatistic = new LinkedList<>();
        Set<String> validOptions = Set.of("NÃO", "NAO", "N", "SIM", "S");

        String option = "S";

        do{
            System.out.print("Nome do jogador: ");
            String namePlayer = input.nextLine();
            if(!namePlayer.matches("^[a-zA-z\\s]+$")){
                System.out.println("'Nome' possui caracteres inválidos. Tente novamente!");
                continue;
            }

            int howManyMatches;
            while(true){
                try {
                    System.out.printf("Quantas partidas %s jogou: ", namePlayer);
                    howManyMatches = Integer.parseInt(input.nextLine());
                    if (howManyMatches < 0){
                        System.out.println(">>> Números de partidas incorreto. Preencha novamente.");
                        continue;
                    }
                    break;

                } catch (Exception e) {
                    System.out.println(">>> ERROR: Preencha o campo novamente.");

                }
            }

            List<String>listGols = new LinkedList<>();
            for (int i = 1; i <= howManyMatches; i++) {
                System.out.printf("Quantos gols na %dº partida: ", i);
                int gols = Integer.parseInt(input.nextLine());
                if(gols < 0 || gols > 15){
                    System.out.println(">>> Valores negativos ou expressivos não são permitidos");
                    i--;
                    continue;
                }
                listGols.add(String.valueOf(gols));
            }

            Map<String, String> players = new LinkedHashMap<>();
            players.put("Id", String.valueOf(playerStatistic.size() + 1));
            players.put("Nome", namePlayer);
            players.put("Total", String.valueOf(listGols.stream().mapToInt(Integer::parseInt).sum()));
            players.put("Gols", String.join("/",listGols));

            playerStatistic.add(players);

            while(true){
                System.out.print("Quer continuar[S/N]: ");
                option = input.nextLine().trim().toUpperCase();
                if(validOptions.contains(option)){
                    break;
                }
                System.out.println(">>> Insira uma opção válida!");

            }
        }while(!(option.charAt(0) == 'N'));

        System.out.printf("\n%-15s %-15s %-15s %s", "ID", "NOME", "TOTAL", "GOLS\n");
        for(Map<String, String> p : playerStatistic){
            p.forEach((k, v) -> System.out.printf("%-15s ",v));
            System.out.println();
        }

        do{
            System.out.print("\nMostar dados de qual jogador(ENTER P/SAIR): ");
            String idPlayer = input.nextLine().trim();
            try{
                if (Integer.parseInt(idPlayer) > playerStatistic.size() || Integer.parseInt(idPlayer) <= 0) {
                    System.out.println(">>> Id de Jogador não encontrado.");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("ENCERRANDO...");
                break;
            }

            Optional<Map<String,String>> entry = playerStatistic.stream()
                    .filter(player -> player.get("Id").equals(idPlayer))
                    .findFirst();

            if(entry.isPresent()) {
                Map<String, String> choosePlayer = entry.get();
                List<String> iterableGols = Arrays.asList(choosePlayer.get("Gols").split("/"));//entender, essa conversão em map

                System.out.printf("LEVANTAMENTO DO JOGADOR %s\n", choosePlayer.get("Nome"));
                for (int i = 1; i <= iterableGols.size(); i++) {
                    System.out.printf(">> No jogo %s fez %s gols\n", i, iterableGols.get(i - 1));
                }
            }
        }while(true);

    }
}

// Anotar coisas relacionadas ao exercicios:
// Melhor entendimento do lambda
// Compreender o conceito do Map.Entry::get...
// Converter String pra lista