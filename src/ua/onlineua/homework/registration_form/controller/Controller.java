package ua.onlineua.homework.registration_form.controller;

import ua.onlineua.homework.registration_form.model.Model;
import ua.onlineua.homework.registration_form.view.View;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class {@code Controller} is part of the MVC pattern.
 * It takes data from the User, validates that data, puts that data into the Model
 * and gets the result of business logic. After that gives this result to the User.
 */
public class Controller {
    private String name;
    private String nickname;

    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);
        view.printMessage(View.INTRO_MESSAGE);
        view.printMessage(View.INPUT_SURNAME);
        //validation name
        while(!validateName(name = inputWithScanner(sc)));
        //validation nickname
        view.printMessage(View.INPUT_NICKNAME);
        while(!validateNickname(nickname = inputWithScanner(sc)));
        //add Note into Model
        model.addNote(name, nickname);
        view.printMessage(model.getInfoAboutLastAddedNote());
    }

    /**
     * Provides input data about User with console
     * @param sc Scanner object
     */
    private String inputWithScanner(Scanner sc) {
        return sc.nextLine();
    }

    /**
     * Indicates whether the name is matches with the fallowing rules:
     * 1. The name must start with the characters a...z or A...Z;
     * 2. For fallowing characters, the fallowing are allowed: a...z or A...Z or ' or , or -;
     * 3. It is allowed to use several words in the name;
     * 3. The name must be ended a...z or A...Z.
     *
     * @param name the name which to validate
     * @return  {@code true} if this name is matches with rules;
     *          {@code false} otherwise.
     */
    public boolean validateName(String name) {
        Pattern lettersPattern = Pattern.compile("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$");
        Matcher lettersMatcher = lettersPattern.matcher(name);
        if(lettersMatcher.matches()){
            return true;
        }
        view.printMessage(View.SURNAME_IS_WRONG);
        view.printMessage(View.RULES_SURNAME);
        view.printMessage(View.TRY_AGAIN);
        return false;
    }

    /**
     * Indicates whether nickname is matches with next rules:
     * 1. Allowed characters is a...z, A...Z, 0...9 in any order;
     * 2. Length of nickname must be from 6 to 30 include.
     *
     * @param nickname the nickname which to validate
     * @return  {@code true} if this nickname is matches with rules;
     *          {@code false} otherwise.
     */
    public boolean validateNickname(String nickname) {
        Pattern lettersPattern = Pattern.compile("([a-zA-Z0-9]){6,30}");
        Matcher lettersMatcher = lettersPattern.matcher(nickname);
        if(lettersMatcher.matches()){
            return true;
        }
        view.printMessage(View.NICKNAME_IS_WRONG);
        view.printMessage(View.RULES_Nickname);
        view.printMessage(View.TRY_AGAIN);
        return false;
    }
}
