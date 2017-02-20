package com.sambev.mtgplus;

import java.util.ArrayList;

/**
 * Main class that defines a Counter model for a given thing to count
 */

public class Counter {
    private int count;
    private String name;
    private ArrayList<Integer> history;

    public Counter(String initName) {
        this.count = 0;
        this.name = initName;
        this.history = new ArrayList<>();
    }

    public Counter(String initName, int initCount) {
        this.count = initCount;
        this.name = initName;
        this.history = new ArrayList<>();
    }

    public int getCount() {
        return this.count;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Integer> getHistory() {
        return this.history;
    }

    public void add(int amount) {
        this.count += amount;
        this.history.add(amount);
    }

    public void subtract(int amount) {
        this.count -= amount;
        this.history.add(-amount);
    }
}
