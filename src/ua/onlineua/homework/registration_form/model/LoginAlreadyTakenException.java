package ua.onlineua.homework.registration_form.model;

public class LoginAlreadyTakenException extends Exception{
    public LoginAlreadyTakenException(){
        super("Login is already taken.");
    }
}
