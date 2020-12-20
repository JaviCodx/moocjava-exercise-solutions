/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javicodx
 */


    public class List<T> {

        private T[] list;
        private int firstFreeItem;

        public List() {
            this.list = (T[]) new Object[10];
            this.firstFreeItem = 0;
        }

        public int size() {
            return firstFreeItem;
        }

        public boolean isEmpty() {
            return firstFreeItem <= 0;
        }

        public void add(T value) {
            if (firstFreeItem >= list.length) {
                makeListBigger();
            }
            list[firstFreeItem] = value;
            firstFreeItem++;
        }

        public int indexOf(T value) {
            for (int i = 0; i < firstFreeItem; i++) {
                if (list[i].equals(value)) {
                    return i;
                }
            }
            return -1;
        }

        public boolean contains(T value) {
            return indexOf(value) > 0;
        }

        public void remove(T value) {
            int positionRemoved = indexOf(value);
            if (positionRemoved < 0) {
                return;
            }

            moveListValues(positionRemoved);
            firstFreeItem--;
        }

        private void makeListBigger() {
            int newSize = size() + size() / 2;
            T[] newList = (T[]) new Object[newSize];
            for (int i = 0; i < firstFreeItem; i++) {
                newList[i] = list[i];
            }
            list = newList;
        }

        private void moveListValues(int fromPosition) {
            while (fromPosition < firstFreeItem) {
                list[fromPosition] = list[fromPosition + 1];
                //list[fromPosition + 1] = null; irrelevante
                fromPosition++;
            }
        }

        public T get(int index) {
            if (index < 0 || index >= firstFreeItem) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return list[index];
        }
    }


