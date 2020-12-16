/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javicodx
 */
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> Register;
    

    public VehicleRegistry() {

        this.Register = new HashMap<>();
        
    }

    public boolean add(LicensePlate licensePlate, String owner) {

        if (!Register.containsKey(licensePlate)) {
            Register.put(licensePlate, owner);
            return true;

        }

        if (Register.containsKey(licensePlate)) {
            if (Register.get(licensePlate).isEmpty()) {
                Register.put(licensePlate, owner);
                return true;
            }
        }
        return false;

    }

    public String get(LicensePlate licensePlate) {
        if (Register.containsKey(licensePlate)) {
            return Register.get(licensePlate);
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!Register.containsKey(licensePlate)) {
            return false;
        }

        Register.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate license : this.Register.keySet()) {
            System.out.println(license);

        }
    }

    public void printOwners() {
        
        ArrayList<String> owners = new ArrayList<>();
        
        for (String owner : this.Register.values()) {
            if (!owners.contains(owner)) {
                System.out.println(owner);
                owners.add(owner);
            }
        }
        
        
    }

}
