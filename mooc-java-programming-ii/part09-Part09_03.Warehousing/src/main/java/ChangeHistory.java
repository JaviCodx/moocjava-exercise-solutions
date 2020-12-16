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

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }
    @Override
    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {
        double max = 0;
        for (Double status : this.history) {
            if (status > max) {
                max = status;
            }

        }
        return max;

    }

    public double minValue() {
        double min = this.history.get(0);
        for (Double status : this.history) {
            if (status < min) {
                min = status;
            }

        }
        return min;

    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }

        int counter = 0;
        double sum = 0;

        for (Double status : this.history) {
            sum += status;
            counter++;

        }

        return sum / counter;

    }

}
