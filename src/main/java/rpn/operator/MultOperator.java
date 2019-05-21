package rpn.operator;

import rpn.Stack;

public class MultOperator extends Operator {
    public MultOperator(String token) {
        super(token);
    }

    @Override
    public void calculate(Stack stack) {
        stack.push( stack.pop() * stack.pop() );
    }
}
