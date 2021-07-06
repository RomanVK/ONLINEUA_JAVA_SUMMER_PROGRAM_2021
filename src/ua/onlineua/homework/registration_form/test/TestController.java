package ua.onlineua.homework.registration_form.test;

import org.junit.Assert;
import org.junit.Test;
import ua.onlineua.homework.registration_form.Controller;
import ua.onlineua.homework.registration_form.Model;
import ua.onlineua.homework.registration_form.View;

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
        boolean isNicknameValid = controller.validateNickname("VanVanich99");
        Assert.assertTrue(isNicknameValid);
    }
}
