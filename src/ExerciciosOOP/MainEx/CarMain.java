package ExerciciosOOP.MainEx;

import ExerciciosOOP.ClassEx.CarClass;

public class CarMain {
    public static void main(String[] args) {
        CarClass carOne = new CarClass();
        CarClass carTwo = new CarClass();

        carOne.name = "Fiat";
        carOne.model = "Touro";
        carOne.year = 2020;

        carTwo.name = "Audi";
        carTwo.model = "KM";
        carTwo.year = 2023;

        System.out.println(carOne.name + " " + carOne.model + " " + carOne.year);
        System.out.println(carTwo.name + " " + carTwo.model + " " + carTwo.year);

    }
}
