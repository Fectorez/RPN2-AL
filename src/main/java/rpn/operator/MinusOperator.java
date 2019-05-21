package rpn.operator;

import rpn.Stack;

public class MinusOperator extends Operator {
    public MinusOperator(String token) {
        super(token);
    }

    @Override
    public void calculate(Stack stack) {
        stack.push( -stack.pop() + stack.pop() );
    }
}
