package rpn;

public class MinusOperator extends Operator {
    public MinusOperator(String token) {
        super(token);
    }

    @Override
    public double calculate(Stack stack) {
        return -stack.pop() + stack.pop();
    }
}
