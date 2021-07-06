package ua.onlineua.homework.registration_form;

/**
 * Class {@code View} is part of the MVC pattern.
 * It shows data to User.
 *
 *  @author  RomanVK
 */
public class View {
    public static final String INTRO_MESSAGE =
            "To add a new note to you notebook you must input the following information:";
    public static final String INPUT_SURNAME = "Input Surname: ";
    public static final String RULES_SURNAME =
            "For the surname can be used only alphabetical characters" +
                    "and the fallowing utility characters \''\' , \'.\',  \'-\'.";
    public static final String INPUT_NICKNAME = "Input Nickname: ";
    public static final String RULES_Nickname =
            "For the nickname can be used only letters and numbers. Nickname length must be from 6 to 30 characters.";
    public static final String SURNAME_IS_WRONG = "Surname is wrong.";
    public static final String NICKNAME_IS_WRONG = "Nickname is wrong.";
    public static final String TRY_AGAIN = "Please,try again.";

    /**
     * Prints a message from one String argument
     * @param message single String
     */
    public void printMessage(String message){
        System.out.println(message);
    }

}
