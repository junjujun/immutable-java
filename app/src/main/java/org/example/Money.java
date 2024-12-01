package org.example;

public class Money {
    private int value;

    public Money(final int value) {
        this.value = value;
    }

    public void add(final int value) {
        this.value += value;
    }

    @Override
    public String toString() {
        return "value: " + value;
    }
}
