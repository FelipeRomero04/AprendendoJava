package Exercicios;

public class ex035 {
    public static void main(String[] args){
        int sum = 0;
        int values = 0;

        for (int i = 0; i <= 500; i++){
            if (i % 3 == 0 && i % 2 == 1){
                sum += i;
                values++;
            }
        }
        System.out.printf("%d %d", values, sum);
    }
}
