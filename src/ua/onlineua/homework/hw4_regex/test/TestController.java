package ua.onlineua.homework.hw4_regex.test;

import org.junit.Assert;
import org.junit.Test;
import ua.onlineua.homework.hw4_regex.Controller;

public class TestController {
    @Test
    public void testValidateName(){
        Controller controller = new Controller();
        boolean isNameValid = controller.validateName("Ivan Ivanovich Ivanov");
        Assert.assertTrue(isNameValid);
    }
}
