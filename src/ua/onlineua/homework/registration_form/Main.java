package ua.onlineua.homework.registration_form;

/**
 * Class {@code Main} is program entry point.
 *
 *  @author  RomanVK
 */
public class Main {
    public static void main(String[] args) {
        // Initialization
        Controller controller = new Controller(new Model(), new View());
        // Run
        controller.processUser();
    }
}
