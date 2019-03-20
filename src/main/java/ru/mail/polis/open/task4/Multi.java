package ru.mail.polis.open.task4;

public class Multi implements Expr {

    private final Expr left;
    private final Expr right;

    public Multi(Expr left, Expr right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }
}
