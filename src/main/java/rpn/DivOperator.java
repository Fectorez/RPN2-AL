package rpn;

public class DivOperator extends Operator{
    private static double EPSILON = 10e-5;

    public DivOperator(String token) {
        super(token);
    }

    @Override
    public double calculate(Stack stack) {
        double b = stack.pop();
        double a = stack.pop();

        if ( equals0(b) ) {
            throw new ArithmeticException("Division by 0");
        }

        return a / b;
    }

    private boolean equals0(double val) {
        return Math.abs(val) < EPSILON;
    }
}
