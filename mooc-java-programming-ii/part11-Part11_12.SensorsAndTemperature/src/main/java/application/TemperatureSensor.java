/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author javicodx
 */
public class TemperatureSensor implements Sensor {

    private boolean status;

    public TemperatureSensor() {
        this.status = false;
    }

    @Override
    public boolean isOn() {
        return this.status;

    }

    @Override
    public void setOff() {
        this.status = false;
    }

    @Override
    public void setOn() {
        this.status = true;
    }

    @Override
    public int read() {
        if (this.isOn()) {
            return new Random().nextInt(30) - new Random().nextInt(30);

        }

        throw new IllegalStateException();
    }

}
