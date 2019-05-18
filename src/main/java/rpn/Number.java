package rpn;

public class Number extends Token {
    public Number(Token token) {
        super(token.getValue());
    }

    public double getDouble() {
        return Double.parseDouble(super.getValue());
    }
}
