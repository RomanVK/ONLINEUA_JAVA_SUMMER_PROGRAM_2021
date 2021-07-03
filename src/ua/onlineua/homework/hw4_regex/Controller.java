package ua.onlineua.homework.hw4_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class {@code Controller} is part of the MVC pattern.
 * It takes data from the User, validates that data, puts that data into the Model
 * and gets the result of business logic. After that gives this result to the User.
 */
public class Controller {

    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    /**
     * Indicates whether name is matches with regex.
     * Regex is ^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$
     *
     * @param name the name which to validate
     * @return  {@code true} if this name is matches with regex;
     *          {@code false} otherwise.
     */
    public boolean validateName(String name) {
        Pattern lettersPattern = Pattern.compile("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$");
        Matcher lettersMatcher = lettersPattern.matcher(name);
        if(lettersMatcher.matches()){
            return true;
        }
        return false;
    }

    /**
     * Indicates whether nickname is matches with next rules:
     * 1. Allowed characters is a...z, A...Z, 0...9 in any order;
     * 2. Length of nickname must be from 6 to 30 include.
     *
     * @param nickname the nickname which to validate
     * @return  {@code true} if this nickname is matches with regex;
     *          {@code false} otherwise.
     */
    public boolean validateNickname(String nickname) {
        Pattern lettersPattern = Pattern.compile("([a-zA-Z0-9]){6,30}");
        Matcher lettersMatcher = lettersPattern.matcher(nickname);
        if(lettersMatcher.matches()){
            return true;
        }
        return false;
    }
}
