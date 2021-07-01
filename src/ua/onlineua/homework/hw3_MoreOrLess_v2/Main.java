package ua.onlineua.homework.hw3_MoreOrLess_v2;

/**
 * Created by RomanVK on 01.07.2021.
 */
public class Main {
    public static void main(String[] args) {
        // Initialization
        Controller controller = new Controller(new Model(), new View());
        // Run
        controller.processUser();
    }
}
