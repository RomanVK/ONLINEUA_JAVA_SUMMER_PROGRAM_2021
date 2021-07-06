package ua.onlineua.homework.registration_form;

import ua.onlineua.homework.registration_form.controller.Controller;
import ua.onlineua.homework.registration_form.model.Model;
import ua.onlineua.homework.registration_form.view.View;

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
