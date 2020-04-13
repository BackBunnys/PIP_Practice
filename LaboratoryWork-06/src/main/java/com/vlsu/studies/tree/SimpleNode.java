package com.vlsu.studies.tree;

public class SimpleNode<T> implements INode {
    private final T value;

    public SimpleNode(T value) {
        this.value = value;
    }

    public T calculate() {
        return value;
    }

}
