package oops_practice.gcr_codebase.generics;

import java.util.ArrayList;

public class Repository<T> {

    private ArrayList<T> data = new ArrayList<>();

    public void add(T item) {
        data.add(item);
    }

    public void remove(T item) {
        data.remove(item);
    }

    public ArrayList<T> getAll() {
        return data;
    }
}