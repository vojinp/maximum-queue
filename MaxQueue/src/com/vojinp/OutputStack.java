package com.vojinp;

public class OutputStack<T extends Comparable<T>> extends MaxStack<ElementWithMax<T>, T> {
    @Override
    protected ElementWithMax<T> createElement(T element) {
        return new ElementWithMax<>(element, getMax());
    }

    @Override
    protected T getElement(ElementWithMax<T> element) {
        return element.getElement();
    }

    public T peekMax() {
        if (stack.isEmpty()) {
            return null;
        }

        return stack.peek().getMax();
    }
}
