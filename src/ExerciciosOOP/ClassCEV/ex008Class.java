package ExerciciosOOP.ClassCEV;

public class ex008Class {
    String coin = "R$";

    public String halfPrice(double price, boolean formatted){
        StringBuilder bd = new StringBuilder();
        double half = price / 2;
        if(formatted){
            return formatedPrice(half, this.coin);
        }
        return String.valueOf(half);
    }

    public String doublePrice(double price, boolean formatted){
        StringBuilder bd = new StringBuilder();
        double doublePrice = price * 2;
        if(formatted){
            return formatedPrice(doublePrice, this.coin);
        }
        return String.valueOf(doublePrice);
    }

    public String tenPercent(double price, boolean formatted){
        StringBuilder bd = new StringBuilder();
        double tenPercent = price + (price * 0.1);
        if(formatted){
            return formatedPrice(tenPercent, this.coin);
        }
        return String.valueOf(tenPercent);
    }

   public String formatedPrice(double price, String coin){
        this.coin = coin;
        return coin + String.format("%.2f", price).replace(".", ",");



    }


}
