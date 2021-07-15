package ua.onlineua.homework.hw_lambda;

public class Main {
    public static void main(String[] args) {
        sell(() -> System.out.println("Sell cat"));
    }

    private static void sell(Saleable s) {
        s.sell();
    }

}
