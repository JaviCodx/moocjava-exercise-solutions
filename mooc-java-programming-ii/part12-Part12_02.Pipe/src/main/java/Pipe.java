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

public class Pipe<T> {

    private List<T> object;

    public Pipe() {
        this.object = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.object.add(value);
    }

    public T takeFromPipe() {

        T temp = this.object.get(0);
        this.object.remove(0);
        return temp;

    }

    public boolean isInPipe() {
        return !this.object.isEmpty();
    }

}
