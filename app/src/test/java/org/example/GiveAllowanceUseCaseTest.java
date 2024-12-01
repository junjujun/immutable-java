package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GiveAllowanceUseCaseTest {
    @Test
    public void testGiveAllowance() {
        final Child taro = new Child("Taro");
        final Money fiveHundred = new Money(500);
        taro.receiveAllowance(fiveHundred);
        assertEquals(fiveHundred, taro.pocket());

        final Child jiro = new Child("Jiro");
        final Money oneThousand = fiveHundred.plus(500);
        jiro.receiveAllowance(oneThousand);
        assertEquals(oneThousand, jiro.pocket());

        assertEquals(new Money(500), taro.pocket());
    }
}
