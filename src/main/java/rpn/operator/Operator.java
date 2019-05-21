package rpn.operator;

import rpn.Stack;
import rpn.Token;

public abstract class Operator extends Token {

    public Operator(String token) {
        super(token);
    }

    public abstract void calculate(Stack stack);
}
