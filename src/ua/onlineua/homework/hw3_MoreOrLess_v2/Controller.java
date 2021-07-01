package ua.onlineua.homework.hw3_MoreOrLess_v2;

import java.util.Scanner;

/**
 * Created by RomanVK on 01.07.2021.
 */
public class Controller {

    private int userInput;
    private boolean numberWasGuessed = false;

    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner scanner = new Scanner(System.in);
        model.setPrimaryBarrier(GlobalConstants.DEFAULT_MINIMUM, GlobalConstants.DEFAULT_MAXIMUM);
        model.setHiddenNumber();
        view.printMessage(View.INTRO_MESSAGE);
        do{
            view.printMessage(View.CONDITIONS + " "
                    + model.getLastMinimumNumber() + " and " + model.getLastMaximumNumber());

            if(scanner.hasNextInt()){
                userInput = scanner.nextInt();
                if(userInput >= model.getLastMinimumNumber()
                        && userInput <= model.getLastMaximumNumber()){
                    if(userInput == model.getHiddenNumber()){
                        numberWasGuessed = true;
                    }
                    else if(!hasNumberAlreadyBeen(model.getValidAttempts(), userInput)){
                            model.addValidAttempt(userInput);
                            model.setActualRange();
                            view.printMessage(model.getLastInputNumber() + " is " +
                                    model.getRatio() + View.IS_NOT_HIDDEN_NUMBER);
                        }
                }
                else{
                    view.printMessage(View.IS_NOT_IN_ACTUAL_RANGE);
                }
            }
            else {
                view.printMessage(View.IS_NOT_INTEGER);
            }

        }while(!numberWasGuessed);

        view.printMessage(View.CONGRATULATION + model.getHiddenNumber());
        view.printValidAttempts(model.getValidAttempts());
    }

    // The Util method
    private boolean hasNumberAlreadyBeen(int[] validAttempts, int userInput){
        return validAttempts[userInput] == userInput;
    }


}
