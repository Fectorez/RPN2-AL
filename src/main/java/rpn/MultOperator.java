package rpn;

public class MultOperator extends Operator {
    public MultOperator(String token) {
        super(token);
    }

    @Override
    public double calculate(Stack stack) {
        return stack.pop() * stack.pop();
    }
}
