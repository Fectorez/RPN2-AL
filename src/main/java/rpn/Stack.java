package rpn;

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
}
