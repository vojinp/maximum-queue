package com.vojinp;

public class ElementWithMax<T> {
    private T element;
    private T max;

    public ElementWithMax(T element, T max) {
        this.element = element;
        this.max = max;
    }

    public T getElement() {
        return element;
    }

    public T getMax() {
        return max;
    }

    @Override
    public String toString() {
        return "ElementWithMax{" +
                "element=" + element +
                ", max=" + max +
                '}';
    }
}
