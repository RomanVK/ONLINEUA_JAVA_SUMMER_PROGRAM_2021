package ua.onlineua.homework.arrays;
/**
 * Created by RomanVK on 26.06.2021.
 */
public class Main {
    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();
    }
}
