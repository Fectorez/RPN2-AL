package rpn.operator;

import rpn.Stack;

public class SqrtOperator extends Operator {

    public SqrtOperator(String token) {
        super(token);
    }

    @Override
    public void calculate(Stack stack) {
        stack.push( Math.sqrt(stack.pop()) );
    }
}
