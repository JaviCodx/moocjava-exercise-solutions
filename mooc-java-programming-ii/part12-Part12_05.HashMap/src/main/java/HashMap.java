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

public class HashMap<K, V> {

    private List<Pair<K, V>>[] internalAr;
    private int firstFreeItem;

    public HashMap() {
        this.internalAr = new List[32];
        this.firstFreeItem = 0;
    }

    private int calculateHashCode(K key, List[] arValues) {
        return Math.abs(key.hashCode() % arValues.length);
    }

    public V get(K key) {
        int hashValue = calculateHashCode(key, internalAr);
        if (this.internalAr[hashValue] == null) {
            return null;
        }

        List<Pair<K, V>> valuesAtIndex = this.internalAr[hashValue];
        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.get(i).getKey().equals(key)) {
                return valuesAtIndex.get(i).getValue();
            }
        }

        return null;
    }

    private int getIndexOfKey(List<Pair<K, V>> list, K key) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getKey().equals(key)) {
                index = i;
                break;
            }
        }
        return index;
    }

    private List<Pair<K, V>> getListBaseOnKey(K key) {
        int hashValue = calculateHashCode(key, internalAr);
        if (internalAr[hashValue] == null) {
            internalAr[hashValue] = new ArrayList<>();
        }

        return internalAr[hashValue];
    }

    private void copy(List<Pair<K, V>>[] newArray, int fromIdx) {
        for (int i = 0; i < this.internalAr[fromIdx].size(); i++) {
            Pair<K, V> value = this.internalAr[fromIdx].get(i);

            int hashValue = calculateHashCode(value.getKey(), newArray);
            if (newArray[hashValue] == null) {
                newArray[hashValue] = new ArrayList<>();
            }

            newArray[hashValue].add(value);
        }
    }

    private void grow() {
        List<Pair<K, V>>[] newBiggerInternarAr = new List[this.internalAr.length * 2];

        for (int i = 0; i < this.internalAr.length; i++) {
            copy(newBiggerInternarAr, i);
        }

        this.internalAr = newBiggerInternarAr;
    }

    public void add(K key, V value) {
        List<Pair<K, V>> valuesAtIndex = getListBaseOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeItem++;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }

        if (1.0 * this.firstFreeItem / this.internalAr.length > 0.75) {
            grow();
        }
    }

    public V remove(K key) {
        List<Pair<K, V>> valuesAtIndex = getListBaseOnKey(key);
        if (valuesAtIndex.size() == 0) {
            return null;
        }

        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            return null;
        }

        Pair<K, V> pair = valuesAtIndex.get(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }
}
