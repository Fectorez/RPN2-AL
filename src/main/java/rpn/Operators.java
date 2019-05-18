package rpn;

import java.util.Optional;

public class Operators {
    private static final String ADD = "+";
    private static final String SUB = "-";
    private static final String MUL = "*";
    private static final String DIV = "/";

    public static Optional<Operator> findOperator(Token token) {
        String value = token.getValue();
        switch ( value ) {
            case ADD:
                return Optional.of(new PlusOperator(value));
            case SUB:
                return Optional.of(new MinusOperator(value));
            case MUL:
                return Optional.of(new MultOperator(value));
            case DIV:
                return Optional.of(new DivOperator(value));
            default:
                return Optional.ofNullable(null);
        }
    }
}
