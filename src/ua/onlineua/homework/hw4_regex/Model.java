package ua.onlineua.homework.hw4_regex;

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
     * @param nickname User nickname
     */
    public void addNote(String name, String nickname){
        noteBook.add(new Note(name, nickname));
    }

    /**
     * Gives data about last added note
     *
     * @return String from the data about last added Note
     */
    public String getInfoAboutLastAddedNote(){
        return "Note (name: " +
                noteBook.get(noteBook.size() - 1).name +
                ", nickname: " +
                noteBook.get(noteBook.size() - 1).nickname +
                ") is added";
    }

}

/**
 * Class {@code Note} contains User's name and nickname .
 *
 * @author  RomanVK
 */
class Note{
    String name;
    String nickname;

    Note(String name, String nickname){
        this.name = name;
        this.nickname = nickname;
    }
}
