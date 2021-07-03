package ua.onlineua.homework.hw4_regex;

import java.util.ArrayList;
/**
 * Class {@code Model} is part of the MVC pattern.
 * It contains business logic and data.
 *
 * @author  RomanVK
 */
public class Model {

    ArrayList<Note> noteBook = new ArrayList<>();

    public void addNote(String name, String nickname){
        noteBook.add(new Note(name, nickname));
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
