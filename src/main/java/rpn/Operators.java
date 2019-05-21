package rpn;

import rpn.operator.*;

import java.util.Optional;

public class Operators {
    public static final String ADD = "+";
    public static final String SUB = "-";
    public static final String MUL = "*";
    public static final String DIV = "/";
    public static final String SWAP = "SWAP";
    public static final String SQRT = "SQRT";
    public static final String DROP = "DROP";
    public static final String TIMES = "TIMES";

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
            case SWAP:
                return Optional.of(new SwapOperator(value));
            case SQRT:
                return Optional.of(new SqrtOperator(value));
            case DROP:
                return Optional.of(new DropOperator(value));
            case TIMES:
                return Optional.of(new TimesOperator(value));
            default:
                return Optional.ofNullable(null);
        }
    }
}
