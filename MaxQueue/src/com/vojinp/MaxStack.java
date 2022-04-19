package com.vojinp;

import java.util.Stack;

public abstract class MaxStack<T, E extends Comparable<E>> {
    protected Stack<T> stack = new Stack<>();
    protected E max;

    public E push(E element) {
        if (max == null || element.compareTo(max) > 0) {
            max = element;
        }

        return getElement(stack.push(createElement(element)));
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public E pop() {
        return getElement(stack.pop());
    }

    public E getMax() {
        return max;
    }

    public void clearMax() {
        max = null;
    }

    abstract T createElement(E element);

    abstract E getElement(T element);
}
