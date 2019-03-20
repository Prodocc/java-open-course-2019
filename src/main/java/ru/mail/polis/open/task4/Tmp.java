package ru.mail.polis.open.task4;

import static java.lang.Character.isDigit;

public class Tmp implements ExprBuilder {

    public static void main(String[] args) {
        Tmp expr = new Tmp();
        System.out.println(expr.build("5 + 5 * 2").evaluate());
        System.out.println(expr.build("(2 * 3) + 4").evaluate());
//        Const const1 = new Const(5);
//        Const const2 = new Const(4);
//        Add add = new Add(const1, const2);
//        System.out.println(add.evaluate());

    }


    //    @Override
//    public Expr build(String input) {
//        input = input.replace(" ", "");
//        if (input.startsWith("(") && input.endsWith(")")) {
//            return build(input.substring(1, input.length() - 1));
//        } else if (input.startsWith("(") && !input.endsWith(")")) {
//            throw new IllegalArgumentException("error with brackets");
//        } else {
//            int pos = 0;
//            while (pos < input.length() - 1) {
//                if (isDigit(input.charAt(pos))) {
//                    pos++;
//                } else {
//                    Const leftOperand = new Const(Integer.valueOf(input.substring(0, pos)));
//                    char operation = input.charAt(pos);
//                    Const rightOperand = build(input.substring(pos + 1));
//                    switch (operation) {
//                        case '+':
//                            return new Add(leftOperand, rightOperand);
//                        case '-':
//                            return new Sub(leftOperand, rightOperand);
//                        case '*':
//                            return new Multi(leftOperand, rightOperand);
//                        case '/':
//                            return new Div(leftOperand, rightOperand);
//                    }
//                }
//            }
//        }
//        return new Tmp1();
//    }

    //(2 * 3) + 4 = 10
    @Override
    public Expr build(String input) {
        input = input.replace(" ", "");
        if (input.startsWith("(") && input.endsWith(")")) {
            return build(input.substring(1, input.length() - 1));
        } else if (input.startsWith("(") && !input.endsWith(")")) {
            //return build(input.substring(1, ))
        } else {
            int pos = 0;
            while (pos < input.length() - 1) {
                if (isDigit(input.charAt(pos))) {
                    pos++;
                } else {
                    Const leftOperand;
                }
            }
        }
        return new Tmp1();
    }

}
