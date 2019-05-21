package rpn;

import java.util.Arrays;

public class Stack {
    private double[] stack = new double[0];

    public double pop() {
        double res = stack[stack.length-1];

        double[] newStack = new double[stack.length-1];
        System.arraycopy(stack, 0, newStack, 0, newStack.length);
        this.stack = newStack;

        return res;
    }

    public void push(double val) {
        double[] newStack = new double[this.stack.length+1];

        System.arraycopy(this.stack, 0, newStack, 0, this.stack.length);
        newStack[newStack.length-1] = val;
        this.stack = newStack;
    }

    public int size() {
        return stack.length;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (double v : stack) {
            str.append(v).append(" ");
        }
        str.deleteCharAt(str.length()-1); // Delete last space

        return str.toString();
    }
}
