package ua.onlineua.homework.basic;

import java.util.Scanner;

/**
 * Created by RomanVK on 24.06.2021.
 */
public class Controller {
    public static final String FIRST_WORD = "Hello";
    public static final String SECOND_WORD = "world!";

    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        String firstWord = null;
        String secondWord = null;
        String someWord;

        do{
            view.printMessage(View.INPUT_FIRST_WORD);
            someWord = getWord();
            if (someWord.equals(FIRST_WORD)){
                firstWord = someWord;
            } else {
                view.printMessage(View.WRONG_WORD);
            }
        } while(firstWord==null);

        do{
            view.printMessage(View.INPUT_SECOND_WORD);
            someWord = getWord();
            if (someWord.equals(SECOND_WORD)){
                secondWord = someWord;
            } else {
                view.printMessage(View.WRONG_WORD);
            }
        } while(secondWord==null);

        view.printMessage(model.concatenation(firstWord, secondWord));

    }

    // The Utility methods
    private String getWord(){
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        return line;
    }
}
