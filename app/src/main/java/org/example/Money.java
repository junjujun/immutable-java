package org.example;

import java.util.Objects;

public class Money {
    private final int value;

    public Money(final int value) {
        this.value = value;
    }

    public Money plus(final int value) {
        return new Money(this.value + value);
    }

    @Override
    public String toString() {
        return "value: " + value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Money money = (Money) obj;
        return value == money.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value); // プロパティに基づいたハッシュコードを生成
    }
}
