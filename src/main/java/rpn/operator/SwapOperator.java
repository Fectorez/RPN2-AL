package rpn.operator;

import rpn.Stack;

public class SwapOperator extends Operator{

    public SwapOperator(String token) {
        super(token);
    }

    @Override
    public void calculate(Stack stack) {
        double a = stack.pop();
        double b = stack.pop();
        stack.push(a);
        stack.push(b);
    }
}
