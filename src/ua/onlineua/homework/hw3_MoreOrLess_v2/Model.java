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

    public void setHiddenNumber(int hiddenNumber){
        this.hiddenNumber = hiddenNumber;
    }

    public int getHiddenNumber(){
        return hiddenNumber;
    }

    public void setPrimaryBarrier(int lastMinimumNumber, int lastMaximumNumber){
        this.lastMinimumNumber = lastMinimumNumber;
        this.lastMaximumNumber = lastMaximumNumber;
    }

    public int getLastInputNumber(){
        return lastInputNumber;
    }

    public void setLastInputNumber(int lastInputNumber) {
        this.lastInputNumber = lastInputNumber;
    }

    public void setActualRange(){
        if (hiddenNumber > this.lastInputNumber) {
            setRatio("less");
            setLastMinimumNumber(lastInputNumber + 1);
        } else {
            setRatio("great");
            setLastMaximumNumber(lastInputNumber - 1);
        }
    }

    public void setLastMinimumNumber(int lastMinimumNumber){
        this.lastMinimumNumber = lastMinimumNumber;
    }

    public void setLastMaximumNumber(int lastMaximumNumber) {
        this.lastMaximumNumber = lastMaximumNumber;
    }

    public void setRatio(String ratio){
        this.ratio = ratio;
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
        setLastInputNumber(validAttempt);
        setValidAttempts(validAttempt);
    }

    public void setValidAttempts(int validAttempt){
        this.validAttempts[validAttempt] = validAttempt;
    }

    public String getRatio(){
        return this.ratio;
    }

}
