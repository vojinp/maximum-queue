package com.vojinp;

public class MaximumQueue<T extends Comparable<T>> {
    private InputStack<T> input = new InputStack<>();
    private OutputStack<T> output = new OutputStack<>();

    public void enQueue(T element) {
        input.push(element);
    }

    public T deQueue() {
        if (output.isEmpty()) {
            rebalanceStacks();
        }

        return output.pop();
    }

    public T getMax() {
        if (output.isEmpty()) {
            return input.getMax();
        }

        if (input.getMax() == null) {
            return output.peekMax();
        }

        return output.peekMax().compareTo(input.getMax()) > 0 ?
                output.peekMax() : input.getMax();
    }

    private void rebalanceStacks() {
        while (!input.isEmpty()) {
            output.push(input.pop());
        }
        clearStacks();
    }

    private void clearStacks() {
        input.clearMax();
        output.clearMax();
    }
}
