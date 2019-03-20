package ru.mail.polis.open.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExprBuilderTest {

    @Test
    void test() {
        assertEquals(
                10,
                new Add(
                        new Multi(
                                new Const(2),
                                new Const(3)
                        ),
                        new Const(4)
                ).evaluate());
    }
}
