
import java.util.ArrayList;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mantas
 */
public class Room {

    private ArrayList<Person> peopleInARoom = new ArrayList<>();

    public Room() {
    }

    public void add(Person person) {
        peopleInARoom.add(person);
    }

    public boolean isEmpty() {
        if (peopleInARoom.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {

        return peopleInARoom;
    }

    public Person shortest() {
        if (peopleInARoom.isEmpty()) {
            return null;
        }

        return (Person) peopleInARoom.stream().sorted(Comparator.comparing(Person::getHeight)).findFirst().get();
    }

    public Person take() {
        Person shortie = shortest();
        if (peopleInARoom.isEmpty()) {
            return null;
        }
        if (peopleInARoom.contains(shortest())) {
            peopleInARoom.remove(peopleInARoom.stream().sorted(Comparator.comparing(Person::getHeight)).findFirst().get());
        }
        return shortie;
    }
}
