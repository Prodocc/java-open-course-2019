package ru.mail.polis.open.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//todo
class UnarySubTest {

    @Test
    void test() {
        assertEquals(
                12,
                new UnarySub(
                        -12
                ).evaluate()
        );
    }

}