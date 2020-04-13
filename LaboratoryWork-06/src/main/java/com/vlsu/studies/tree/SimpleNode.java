package com.vlsu.studies.tree;

public class SimpleNode<T> implements INode<T> {
    private final T value;

    public SimpleNode(T value) {
        this.value = value;
    }

    public T calculate() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

}
