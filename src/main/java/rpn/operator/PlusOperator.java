package rpn.operator;

import rpn.Stack;

public class PlusOperator extends Operator {
    public PlusOperator(String token) {
        super(token);
    }

    @Override
    public void calculate(Stack stack) {
        stack.push( stack.pop() + stack.pop() );
    }
}
