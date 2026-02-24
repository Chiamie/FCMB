package com;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Example {
    public static void main(String[] args) {
        Comparator<Integer> descendingOrder = (x, y)->{
            if (y>x) return 1;
            else if (y<x) return -1;
            else return 0;
        };

        Set<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(100);

        System.out.println(numbers);
    }
}
