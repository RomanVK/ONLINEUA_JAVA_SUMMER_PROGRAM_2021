package ua.onlineua.homework.registration_form.model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Class {@code Model} is part of the MVC pattern.
 * It contains business logic and data.
 *
 * @author  RomanVK
 */
public class Model {

    private HashMap<String, String> noteBook = new HashMap<>();

    {
        noteBook.put("TarasTaras", "Тарас");
    }

    /**
     * Add Note with the fallowing parameters:
     * @param name User name
     * @param login User login
     */
    public void addNote (String name, String login) throws LoginAlreadyTakenException{
        if (!noteBook.containsKey(login)){
            noteBook.put(login, name);
        } else {
            throw new LoginAlreadyTakenException();
        }
    }

    /**
     * Gives data about last added note
     *
     * @return String from the data about last added Note
     */
    public String getInfoAboutLastAddedNote(String login){
        return "Note (name: " +
                noteBook.get(login) +
                ", login: " +
                login +
                ")";
    }

}

/**
 * Class {@code Note} contains User's name and login .
 *
 * @author  RomanVK
 */
class Note{
    String name;
    String login;

    Note(String name, String login){
        this.name = name;
        this.login = login;
    }
}
