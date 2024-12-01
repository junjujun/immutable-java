package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GiveAllowanceUseCaseTest {
    @Test
    public void testGiveAllowance() {
        Child taro = new Child("Taro");
        Money money = new Money(500);
        taro.receiveAllowance(money);
        assertEquals(money, taro.pocket());

        Child jiro = new Child("Jiro");
        money.plus(500);
        jiro.receiveAllowance(money);
        assertEquals(money, jiro.pocket());

        assertEquals(new Money(500), taro.pocket());
    }
}
