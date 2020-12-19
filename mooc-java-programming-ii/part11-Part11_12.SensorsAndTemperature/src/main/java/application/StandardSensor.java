/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author javicodx
 */
public class StandardSensor implements Sensor {

    private int i;

    public StandardSensor(int i) {
        this.i = i;
    }

    @Override
    public boolean isOn() {
        return true;

    }

    @Override
    public void setOff() {
    }

    @Override
    public void setOn() {

    }

    @Override
    public int read() {
        return this.i;

    }

}
