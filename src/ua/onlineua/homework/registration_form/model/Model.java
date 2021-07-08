package ua.onlineua.homework.registration_form.model;

import java.util.ArrayList;
/**
 * Class {@code Model} is part of the MVC pattern.
 * It contains business logic and data.
 *
 * @author  RomanVK
 */
public class Model {

    private ArrayList<Note> noteBook = new ArrayList<>();

    /**
     * Add Note with the fallowing parameters:
     * @param name User name
     * @param login User login
     */
    public void addNote(String name, String login){
        noteBook.add(new Note(name, login));
    }

    /**
     * Gives data about last added note
     *
     * @return String from the data about last added Note
     */
    public String getInfoAboutLastAddedNote(){
        return "Note (name: " +
                noteBook.get(noteBook.size() - 1).name +
                ", login: " +
                noteBook.get(noteBook.size() - 1).login +
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
