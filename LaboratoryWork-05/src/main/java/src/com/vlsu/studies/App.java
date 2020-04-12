package com.vlsu.studies;

import com.vlsu.studies.math.Math;
import com.vlsu.studies.LISP.ListElement;
import com.vlsu.studies.LISP.ListUtils;

import java.util.Scanner;

public class App {

    public void run() {
        Scanner console = new Scanner(System.in);
        ListElement<Long> head = null;

        System.out.print("Type the number of list's elements: ");
        int N = console.nextInt();

        System.out.print("Type list's elements: ");
        head = ListUtils.read(head, N, System.in, Long::parseLong);

        System.out.print("The total list: ");
        ListUtils.print(
                ListUtils.map(
                        ListUtils.filter(head, Math::isPrimeNumber),
                        x -> x % 7),
                ", ", System.out);
    }

}
