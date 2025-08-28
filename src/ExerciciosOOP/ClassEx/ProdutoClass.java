package ExerciciosOOP.ClassEx;

public class ProdutoClass {
    public String name;
    public double price;
    public int amount;

    public double totalPrice(double price, int amount) {
        if (price < 0) {
            System.out.println("Preço inválido. Insira novamente!");
            return 0;
        }
        if (amount < 0) {
            System.out.println("Quantidade de produtos inválida. Tente novamente!");
            return 0;
        }
        return price * amount;
    }

}

