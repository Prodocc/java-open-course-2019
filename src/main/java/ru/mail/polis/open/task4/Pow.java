package ru.mail.polis.open.task4;

public final class Pow implements Expr {

    private final int value;
    private final int pow;

    public Pow(int value, int pow) {
        this.value = value;
        this.pow = pow;
    }

    @Override
    public int evaluate() {
        return (int) Math.pow(value, pow);
    }
}
