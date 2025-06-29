package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex033 {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Random machine = new Random();
        List<String> moves = new ArrayList<>(Arrays.asList("Pedra", "Papel", "Tesoura"));

        while(true){
            System.out.print("Suas opções:\n[ 1 ]Pedra\n[ 2 ]Papel\n[ 3 ]Tesoura\n");
            String optionUser = input.nextLine();
            int optionMachine = machine.nextInt(0, 3);

            if(optionUser.isEmpty()){
                break;
            }

            int chooseUser = Integer.parseInt(optionUser) - 1;

            String moveUser = moves.get(chooseUser);
            String moveMachine = moves.get(optionMachine);

            if (chooseUser == 0 && optionMachine == 0 ||
                    chooseUser == 1 && optionMachine == 1 ||
                    chooseUser == 2 && optionMachine == 2){
                System.out.printf("EMPATE! %s x %s\n", moveUser, moveMachine);
                Thread.sleep(2000); //sleep intencional


            } else if (chooseUser == 0 && optionMachine == 2 ||
                       chooseUser == 1 && optionMachine == 0 ||
                       chooseUser == 2 && optionMachine == 1) {
                System.out.printf("VOCÊ GANHOU! %s x %s = VITÓRIA\n", moveUser,moveMachine);
                Thread.sleep(2000);
            }else{
                System.out.printf("VOCÊ PERDEU! %s x %s = DERROTA\n", moveUser, moveMachine);
                Thread.sleep(2000);
            }
        }

    }
}
