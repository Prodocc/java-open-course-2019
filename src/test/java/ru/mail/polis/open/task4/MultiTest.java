package ru.mail.polis.open.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//todo
class MultiTest {

    @Test
    void test() {
        assertEquals(
                6,
                new Multi(
                        new Const(2),
                        new Const(3)
                ).evaluate()
        );
    }

}