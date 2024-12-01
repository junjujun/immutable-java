package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GiveAllowanceUseCaseTest {
    @Test
    public void testGiveAllowance() {
        Child taro = new Child("Taro");
        Money fiveHundred = new Money(500);
        taro.receiveAllowance(fiveHundred);
        assertEquals(fiveHundred, taro.pocket());

        Child jiro = new Child("Jiro");
        Money oneThousand = fiveHundred.plus(500);
        jiro.receiveAllowance(oneThousand);
        assertEquals(oneThousand, jiro.pocket());

        assertEquals(new Money(500), taro.pocket());
    }
}
