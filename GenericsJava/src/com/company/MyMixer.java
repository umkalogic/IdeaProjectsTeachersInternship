package com.company;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

public class MyMixer<T> extends AbstractList<T> {
    private ArrayList<T> array;
    private int size;
    public MyMixer() {
        this.array = new ArrayList<>(10);
        this.size = 10;
    }
    public MyMixer(int numElems) {
        if (numElems < 0)
            throw new IllegalArgumentException("Wrong number of elements: "
                    + numElems);
        this.array = new ArrayList<>(numElems);
        this.size = numElems;
    }
    public void shuffle() {
        ArrayList<T> arrayTemp = new ArrayList<>(size);
        for(T elem : array) {
            arrayTemp.add(elem);
        }
        for(int i = 0, j = (size-1); i<size; i++, j--) {
            array.set(i, arrayTemp.get(j));
        }
    }
    public ArrayList<T> getArray() {
      return array;
    }

    @Override
    public T get(int index) {
        return array.get(index);
    }

    @Override
    public int size() {
        return size;
    }
}
