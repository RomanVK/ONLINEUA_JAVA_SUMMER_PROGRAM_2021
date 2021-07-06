package ua.onlineua.homework.registration_form.view;

import java.util.Locale;
import java.util.ResourceBundle;

import static ua.onlineua.homework.registration_form.view.TextConstant.*;

/**
 * Class {@code View} is part of the MVC pattern.
 * It shows data to User.
 *
 *  @author  RomanVK
 */
public class View {

    // Resource Bundle Installation's
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("ua", "UA"));  // Ukrainian
                    //new Locale("en"));        // English

    /**
     * Prints a message from one String argument
     * @param message single String
     */
    public void printMessage(String message){
        System.out.println(message);
    }

}
