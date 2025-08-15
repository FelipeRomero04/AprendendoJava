package Exercicios;

import java.util.*;

public class ex080 {
    public static void main(String[] args){
        Map<String, String> statistic = new LinkedHashMap<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Nome do jogador: ");
        String name = input.nextLine();

        int howManyMatches;
        try {
            System.out.printf("Quantas partidas %s jogou? ", name);
            howManyMatches = Integer.parseInt(input.nextLine());
            if (howManyMatches < 0){
                System.out.print("Não são permitidos valores negativos.");
                return;
            }
        }catch(Exception e){
            System.out.println("ERROR: O campo foi preenchido incorretamente.");
            return;
        }

        statistic.put("Nome", name);

        List<Integer> gols = new ArrayList<>();

        for (int i = 0; i < howManyMatches ; i++) {
            try {
                System.out.printf("Quantas gols na partida %d: ",i + 1);
                int numGol = Integer.parseInt(input.nextLine());
                if (numGol < 0 || numGol >= 15){
                    System.out.print("Não são permitidos valores negativos ou irreais");
                    i--;
                    continue;
                }
                gols.add(numGol);
            }catch (Exception e){
                System.out.println("ERROR: Preencha o campo novamente.");
                i--;
            }
        }
        statistic.put("Gols", String.valueOf(gols));

        int total = gols.stream().mapToInt(n -> n).sum();
        statistic.put("Total", String.valueOf(total));

        System.out.println(statistic);

        System.out.println("=".repeat(30));

        statistic.forEach((k, v) -> System.out.printf("O campo %s tem o valor %s\n", k, v));

        System.out.println("=".repeat(30));

        System.out.printf("O jogador %s jogou %d partidas\n", name, howManyMatches);
        for (int i = 1; i <= howManyMatches; i++) {
            System.out.printf("\t=> Na partida %d, fez %d gols\n", i,gols.get(i - 1));
        }
        System.out.println("Total de "+total+" gols.");

    }
}
