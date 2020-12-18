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
import java.util.List;
import java.util.Iterator;

public class Employees {
    
    private ArrayList<Person> employees;
    
    public Employees() {
        
        this.employees = new ArrayList<>();
        
    }
    
    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        this.employees.addAll(peopleToAdd);
        
    }
    
    public void print() {
        
        Iterator<Person> iterator = employees.iterator();
        
        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            System.out.println(nextInLine);
        }
        
    }
    
    public void print(Education education) {
        
        Iterator<Person> iterator = employees.iterator();
        
        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if (nextInLine.getEducation().equals(education)) {
                System.out.println(nextInLine);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();
        
        while (iterator.hasNext()) {
            
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
            
        }
        
    }
    
}
