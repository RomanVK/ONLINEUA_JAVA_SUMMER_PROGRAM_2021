package ua.onlineua.homework.hw3_MoreOrLess_v2.tests;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import ua.onlineua.homework.hw3_MoreOrLess_v2.*;

public class TestModel {
    private static Model model;

    @BeforeClass
    public static void beforeAllTests(){
        model = new Model();
    }

    @Test
    public void testSetActualRangeWhenHiddenNumberIsBiggerThenInputNumber(){
        //set up
        model.setHiddenNumber(15);
        model.setLastInputNumber(12);
        model.setLastMinimumNumber(10);
        model.setLastMaximumNumber(20);

        //test
        model.setActualRange();
        Assert.assertEquals("less", model.getRatio());
        Assert.assertEquals(13, model.getLastMinimumNumber());
        Assert.assertEquals(20, model.getLastMaximumNumber());
    }

    @Test
    public void testSetActualRangeWhenHiddenNumberIsLessThenInputNumber(){
        //set up
        model.setHiddenNumber(12);
        model.setLastInputNumber(15);
        model.setLastMinimumNumber(10);
        model.setLastMaximumNumber(20);

        //test
        model.setActualRange();
        Assert.assertEquals("great", model.getRatio());
        Assert.assertEquals(10, model.getLastMinimumNumber());
        Assert.assertEquals(14, model.getLastMaximumNumber());
    }
}
