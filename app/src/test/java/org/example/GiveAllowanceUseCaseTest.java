package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GiveAllowanceUseCaseTest {
    @Test
    public void testGiveAllowance() {
        final Child taro = new Child("Taro");
        final Money fiveHundred = new Money(BigDecimal.valueOf(500));
        taro.receiveAllowance(fiveHundred);
        assertEquals(fiveHundred, taro.pocket());

        final Child jiro = new Child("Jiro");
        final Money oneThousand = fiveHundred.plus(BigDecimal.valueOf(500));
        jiro.receiveAllowance(oneThousand);
        assertEquals(oneThousand, jiro.pocket());

        assertEquals(new Money(BigDecimal.valueOf(500)), taro.pocket());
    }
}
