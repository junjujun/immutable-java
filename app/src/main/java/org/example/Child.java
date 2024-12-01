package org.example;

public class Child {
    private final String name;
    private Money pocket;

    public Child(final String name) {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public Money pocket() {
        return pocket;
    }

    public void receiveAllowance(final Money allowance) {
        this.pocket = allowance;
    }
}
