package ua.onlineua.homework.hw2_arrays;
/**
 * Created by RomanVK on 26.06.2021.
 */
public class View {
    // Text's constants
    public static final String INTRO = "Hello, I am JAVA game \"GREATER OR LESS.\"";
    public static final String CONDITIONS = "Try to guess number between ";
    public static final String CONGRATULATION = "Congratulation! You guessed!";
    public static final String IS_NOT_INTEGER = "Warning: You entered note integer. Please, try again." ;
    public static final String IS_NOT_IN_ACTUAL_RANGE ="Warning:" +
            "You entered integer out actual range. Please, try again.";
    public static final String IS_NOT_HIDDEN_NUMBER = " then the hidden number. Please, try Again.";
    public static final String HAS_ALREADY_BEEN = " has already been. Please, try Again.";


    public void printMessage(String message){
        System.out.println(message);
    }

    public void printValidAttempts(int [] validAttempts){
        System.out.print("Your attempts is: ");
        for(int number : validAttempts){
            if(number != -1)
                System.out.print(number + " ");
        }
        System.out.println();
    }

}
