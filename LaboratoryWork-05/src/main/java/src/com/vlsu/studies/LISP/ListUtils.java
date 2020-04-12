package com.vlsu.studies.LISP;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Function;

public class ListUtils {

    public static <T> ListElement<T> insert(ListElement<T> head, T value) {
        if (head == null) {
            return new ListElement<T>(value);
        } else {
            ListElement p = head;
            while (p.getNext() != null) p = p.getNext();
            p.setNext(new ListElement<T>(value));
            return head;
        }
    }

    public static <T> ListElement<T> filter(ListElement<T> head, Predicate<T> condition) {
        ListElement<T> p = null;
        while (head != null) {
            if (condition.test(head.getValue()))
                p = insert(p, head.getValue());
            head = head.getNext();
        }
        return p;
    }

    public static <T> ListElement<T> map(ListElement<T> head, Function<T, T> rule) {
         ListElement p = null;
         while (head != null) {
                T value = head.getValue();
                p = insert(p, rule.apply(value));
                head = head.getNext();
             }
         return p;
    }

    public static <T> void print(ListElement<T> head, String separator, PrintStream stream) {
        if(head != null) {
            stream.print(head.getValue() + ((head.getNext() == null)? "": separator));
            print(head.getNext(), separator, stream);
        }
    }

    public static <T> ListElement<T> read(ListElement<T> head, int count,
                                          InputStream stream, Function<String, T> parseAlgorithm)
    throws ClassCastException, NumberFormatException {
        Scanner sc = new Scanner(stream);
        for(int i = 0; i < count; ++i) {
            head = insert(head, parseAlgorithm.apply(sc.next()));
        }
        return head;
    }

}
