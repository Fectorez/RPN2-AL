package rpn;

public class PlusOperator extends Operator {
    public PlusOperator(String token) {
        super(token);
    }

    @Override
    public double calculate(Stack stack) {
        return stack.pop() + stack.pop();
    }
}
