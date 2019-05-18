package rpn;

public abstract class Operator extends Token {

    public Operator(String token) {
        super(token);
    }

    public abstract double calculate(Stack stack);
}
