/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javicodx
 */
public class Teacher extends Person { 
    
    private int salary;

    public Teacher(String name, String adress, int salary) {
        super(name, adress);
        this.salary = salary;
        
    }

    @Override
    public String toString() {
        return super.toString() + "\n  salary " + this.salary + " euro/month"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
