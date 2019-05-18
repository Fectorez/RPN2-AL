package rpn;

public class Tokenizer {

    public static Token[] tokenize(String expr) {
        String[] elems = expr.split("\\s+");
        Token[] tokens = new Token[elems.length];

        for ( int i = 0 ; i < elems.length ; i++ ) {
            tokens[i] = new Token(elems[i]);
        }

        return tokens;
    }
}
