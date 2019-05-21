package rpn.operator;

import rpn.Stack;

public class TimesOperator extends Operator {

    public TimesOperator(String token) {
        super(token);
    }

    @Override
    public void calculate(Stack stack) {
        double times = stack.pop();
        double toRepeat = stack.pop();

        for ( int i = 0; i < times ; i++ ) {
            stack.push(toRepeat);
        }
    }
}
