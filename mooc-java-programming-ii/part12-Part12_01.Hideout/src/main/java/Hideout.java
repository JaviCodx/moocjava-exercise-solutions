/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javicodx
 */
public class Hideout<T> {

    private T object;

    public Hideout() {

    }

    public void putIntoHideout(T toHide) {
        this.object = toHide;
    }

    public T takeFromHideout() {

        T tmp = this.object;
        this.object = null;

        return tmp;

    }

    public boolean isInHideout() {
        if (this.object == null) {
            return false;
        }
        return true;
    }

}
