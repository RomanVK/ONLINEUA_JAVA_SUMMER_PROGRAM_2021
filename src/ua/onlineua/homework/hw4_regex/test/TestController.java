package ua.onlineua.homework.hw4_regex.test;

import org.junit.Assert;
import org.junit.Test;
import ua.onlineua.homework.hw4_regex.Controller;
import ua.onlineua.homework.hw4_regex.Model;
import ua.onlineua.homework.hw4_regex.View;

public class TestController {
    @Test
    public void testValidateName(){
        Controller controller = new Controller(new Model(), new View());
        boolean isNameValid = controller.validateName("Ivan Ivanovich Ivanov");
        Assert.assertTrue(isNameValid);
    }

    @Test
    public void testValidNickname(){
        Controller controller = new Controller(new Model(), new View());
        boolean isNameValid = controller.validateNickname("VanVanich99");
        Assert.assertTrue(isNameValid);
    }
}
