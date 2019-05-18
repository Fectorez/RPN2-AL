package rpn;

import java.util.Optional;

public class RPN {
    private Stack stack = new Stack();

    public double compute(String expression) {
        Token[] tokens = Tokenizer.tokenize(expression);
        for (Token token : tokens) {
            Optional<Operator> optionalOperator = Operators.findOperator(token);
            if ( optionalOperator.isPresent() ) {
                Operator operator = optionalOperator.get();
                stack.push(operator.calculate(stack));
            }
            else {
                Number number = new Number(token);
                stack.push(number.getDouble());
            }
        }

        if ( stack.size() > 1 ) {
            throw new RuntimeException("Bad format");
        }

        return stack.pop();
    }
}
