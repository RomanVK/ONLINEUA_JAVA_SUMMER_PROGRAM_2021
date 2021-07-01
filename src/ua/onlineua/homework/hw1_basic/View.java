package ua.onlineua.homework.hw1_basic;

/**
 * Created by RomanVK on 24.06.2021.
 */
public class View {
    // Text's constants
    public static final String INPUT_FIRST_WORD = "Input \"" +  Controller.FIRST_WORD +  "\" ";
    public static final String INPUT_SECOND_WORD = "Input \"" + Controller.SECOND_WORD + "\" ";
    public static final String WRONG_WORD = "Wrong input! Repeat please! ";

    public void printMessage(String message){
        System.out.println(message);
    }

}
