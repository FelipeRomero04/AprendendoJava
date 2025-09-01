package ExerciciosOOP.ClassCEV;

public class ex001Class {

    public int factorial(int num, boolean show) {
        int factorial = 1;
        for (int i = num; i != 0; i--) {
            factorial *= i;
            if (show) {
                System.out.print(i);
                if (i > 1) {
                    System.out.print(" x ");
                } else {
                    System.out.print(" = ");
                }
            }
        }
        return factorial;
    }

}

