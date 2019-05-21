package rpn;

import rpn.operator.Operator;

import java.util.Optional;

public class RPN {
    private Stack stack = new Stack();

    public String compute(String expression) {
        Token[] tokens = Tokenizer.tokenize(expression);

        for (Token token : tokens) {
            Optional<Operator> optionalOperator = Operators.findOperator(token);

            if ( optionalOperator.isPresent() ) {
                Operator operator = optionalOperator.get();
                operator.calculate(stack);
            }
            else {
                Number number = new Number(token);
                stack.push(number.getDouble());
            }
        }

        return stack.toString();
    }
}
