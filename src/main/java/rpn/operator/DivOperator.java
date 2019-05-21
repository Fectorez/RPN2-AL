package rpn.operator;

import rpn.Stack;

public class DivOperator extends Operator{
    private static double EPSILON = 10e-5;

    public DivOperator(String token) {
        super(token);
    }

    @Override
    public void calculate(Stack stack) {
        double b = stack.pop();
        double a = stack.pop();

        if ( equals0(b) ) {
            throw new ArithmeticException("Division by 0");
        }

        stack.push( a / b);
    }

    private static boolean equals0(double val) {
        return Math.abs(val) < EPSILON;
    }
}
