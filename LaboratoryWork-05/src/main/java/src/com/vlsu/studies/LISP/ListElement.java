package com.vlsu.studies.LISP;

public class ListElement<T> {
    private final T value;
    private ListElement<T> next;

    public ListElement(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public ListElement<T> getNext() {
        return next;
    }

    public void setNext(ListElement<T> next) {
        this.next = next;
    }

}
