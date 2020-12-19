/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.stream.Collectors;


/**
 *
 * @author javicodx
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
        
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : this.sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOff() {
        for (Sensor sensor : this.sensors) {
            if (sensor.isOn()) {
                sensor.setOff();

            }
        }

    }

    @Override
    public int read() {

        if (!this.isOn() || this.sensors.isEmpty()) {
            throw new IllegalStateException();
        }
        
        int read = (int) sensors.stream().map(sensor -> sensor.read()).mapToInt(i -> i).average().getAsDouble();
        this.readings.add(read);

        return read;
    }

    @Override
    public void setOn() {

        this.sensors.forEach((sensor) -> {
            sensor.setOn();
        });

    }
    
    public List<Integer> readings() {
       
        
        return this.readings;
        
        
    }

}
