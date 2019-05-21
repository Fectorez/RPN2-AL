package rpn.operator;

import rpn.Stack;

public class DropOperator extends Operator {

    public DropOperator(String token) {
        super(token);
    }

    @Override
    public void calculate(Stack stack) {
        stack.pop();
    }
}
