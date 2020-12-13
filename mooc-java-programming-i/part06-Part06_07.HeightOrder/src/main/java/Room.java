/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javicodx
 */
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> persons;

    public Room() {

        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        return this.persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (this.isEmpty()) {
            return null;
        }

        Person returned = this.persons.get(0);

        for (Person person : this.persons) {
            if (person.getHeight() < returned.getHeight()) {
                returned = person;
            }
        }

        return returned;

    }

    public Person take() {

        Person shortestPerson = this.shortest();
        this.persons.remove(shortestPerson);
        return shortestPerson;

    }

}
