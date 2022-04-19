package com.vojinp;

public class InputStack<T extends Comparable<T>> extends MaxStack<T, T> {
    @Override
    protected T createElement(T element) {
        return element;
    }

    @Override
    protected T getElement(T element) {
        return element;
    }
}
