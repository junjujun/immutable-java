package org.example;

import java.math.BigDecimal;
import java.util.Objects;

public final class Money {
    private final BigDecimal value;

    public Money(final BigDecimal value) {
        if (value == null || value.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Money value must be non-null and non-negative");
        }
        this.value = value;
    }

    public Money plus(final BigDecimal value) {
        return new Money(this.value.add(value));
    }

    @Override
    public String toString() {
        return "value: " + value.toPlainString();
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
        return value.compareTo(money.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
