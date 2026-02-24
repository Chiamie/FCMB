package com.ch17.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CustomComparator {

    public static void main(String[]  args) {

        Comparator<String> lengthOrder = (x, y) -> {
            if (y.length() > x.length()) return x.length() - y.length();
            else if (x.length() > y.length()) return y.length() - x.length();
            else return 0;
        };


        Set<String> names = new TreeSet<>(lengthOrder);
        names.add("John");
        names.add("Fathia");
        names.add("Mary");
        names.add("Adedotun");


        System.out.println(names);
    }
}
