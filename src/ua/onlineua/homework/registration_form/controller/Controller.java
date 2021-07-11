package ua.onlineua.homework.registration_form.controller;

import ua.onlineua.homework.registration_form.model.LoginAlreadyTakenException;
import ua.onlineua.homework.registration_form.model.Model;
import ua.onlineua.homework.registration_form.view.TextConstant;
import ua.onlineua.homework.registration_form.view.View;
import static ua.onlineua.homework.registration_form.controller.RegexContainer.REGEX_NAME_UKR;
import static ua.onlineua.homework.registration_form.controller.RegexContainer.REGEX_NAME_LAT;
import static ua.onlineua.homework.registration_form.controller.RegexContainer.REGEX_LOGIN;

import java.util.Scanner;

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
        view.printMessage(View.bundle.getString(TextConstant.INTRO_MESSAGE));
        view.printMessage(View.bundle.getString(TextConstant.INPUT_NAME));
        //validation name
        while(!validateName(name = inputWithScanner(sc)));
        //validation nickname
        view.printMessage(View.bundle.getString(TextConstant.INPUT_LOGIN));
        while(!validateLogin(nickname = inputWithScanner(sc)));
        //add Note into Model
        while(true){
            try{
                model.addNote(name, nickname);
                break;
            } catch (LoginAlreadyTakenException e) {
                System.out.println("Login has already taken : " + nickname);
                view.printMessage(View.bundle.getString(TextConstant.INPUT_LOGIN));
                while(!validateLogin(nickname = inputWithScanner(sc)));
            }
        }
        //print added Note
        view.printMessage(model.getInfoAboutLastAddedNote(nickname));
    }

    /**
     * Provides input data about User with console
     * @param sc Scanner object
     */
    private String inputWithScanner(Scanner sc) {
        return sc.nextLine();
    }

    /**
     * Indicates whether the name is matches with according regular expression.
     *
     * @param name the name which to validate
     * @return  {@code true} if this name is matches with rules;
     *          {@code false} otherwise.
     */
    public boolean validateName(String name) {
        String regex = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;
        if(name.matches(regex)){
            return true;
        }
        view.printMessage(View.bundle.getString(TextConstant.NAME_IS_WRONG));
        view.printMessage(View.bundle.getString(TextConstant.RULES_NAME));
        view.printMessage(View.bundle.getString(TextConstant.TRY_AGAIN));
        return false;
    }

    /**
     * Indicates whether login is matches with according regular expression.
     *
     * @param login the login which to validate
     * @return  {@code true} if this nickname is matches with rules;
     *          {@code false} otherwise.
     */
    public boolean validateLogin(String login) {
        if(login.matches(REGEX_LOGIN)){
            return true;
        }
        view.printMessage(View.bundle.getString(TextConstant.LOGIN_IS_WRONG));
        view.printMessage(View.bundle.getString(TextConstant.RULES_LOGIN));
        view.printMessage(View.bundle.getString(TextConstant.TRY_AGAIN));
        return false;
    }
}
