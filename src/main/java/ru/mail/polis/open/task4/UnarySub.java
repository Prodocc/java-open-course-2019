package ru.mail.polis.open.task4;

public class UnarySub implements Expr {

    private final int value;

    public UnarySub(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return -value;
    }
}
