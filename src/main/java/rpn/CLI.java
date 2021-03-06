package rpn;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CLI {
    public static final void main(String[] args) {
        String expression = Stream.of(args).collect(Collectors.joining(" "));

        System.out.println("About to evaluate '" + expression + "'");
        String result = evaluate(expression);
        System.out.println("> " + result);
    }

    static String evaluate(String expression) {
        RPN rpn = new RPN();
        return rpn.compute(expression);
    }
}
