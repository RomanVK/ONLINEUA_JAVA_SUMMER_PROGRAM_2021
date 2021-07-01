package ua.onlineua.homework.hw3_MoreOrLess_v2;

import java.util.Arrays;

/**
 * Created by RomanVK on 01.07.2021.
 */
public class Model {
    private int hiddenNumber;
    private int[] validAttempts = new int[GlobalConstants.DEFAULT_MAXIMUM + 1];

    private int lastMinimumNumber;
    private int lastMaximumNumber;
    private int lastInputNumber;
    private String ratio;

    {
        Arrays.fill(validAttempts, -1);
    }

    public void setHiddenNumber(){
        hiddenNumber = (int)(Math.ceil(Math.random()
                * (GlobalConstants.DEFAULT_MAXIMUM - GlobalConstants.DEFAULT_MINIMUM)
                + GlobalConstants.DEFAULT_MINIMUM));
    }

    public void setPrimaryBarrier(int lastMinimumNumber, int lastMaximumNumber){
        this.lastMinimumNumber = lastMinimumNumber;
        this.lastMaximumNumber = lastMaximumNumber;
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
