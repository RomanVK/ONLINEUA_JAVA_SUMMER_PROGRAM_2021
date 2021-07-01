package ua.onlineua.homework.hw2_arrays;

import java.util.Arrays;

/**
 * Created by RomanVK on 26.06.2021.
 */
public class Model {


    private static final int DEFAULT_MINIMUM = 0;
    private static final int DEFAULT_MAXIMUM = 100;

    private final int hiddenNumber = (int)(Math.random() * 100);

    private int lastMinimumNumber = DEFAULT_MINIMUM;
    private int lastMaximumNumber = DEFAULT_MAXIMUM;
    private int lastInputNumber;
    private String ratio;

    private final int[] validAttempts = new int[DEFAULT_MAXIMUM + 1];

    {
        Arrays.fill(validAttempts, -1);
    }

    public int getHiddenNumber(){
        return hiddenNumber;
    }

    public int getLastInputNumber(){
        return lastInputNumber;
    }

    public void setActualRange(){
        if (hiddenNumber > this.lastInputNumber) {
            ratio = "less";
            lastMinimumNumber = this.lastInputNumber + 1;
        } else {
            ratio = "greater";
            lastMaximumNumber = this.lastInputNumber - 1;
        }
    }

    public int getLastMinimumNumber(){
        return lastMinimumNumber;
    }

    public int getLastMaximumNumber(){
        return lastMaximumNumber;
    }

    public int [] getValidAttempts(){
        return validAttempts;
    }

    public void addValidAttempt(int validAttempt){
        lastInputNumber = validAttempt;
        validAttempts[validAttempt] = validAttempt;
    }

    public String getRatio(){
        return this.ratio;
    }

}
