package ru.otus;

import com.google.common.primitives.Ints;

@SuppressWarnings("java:S106")
public class HelloOtus {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        boolean contains = Ints.contains(array, 3);
        System.out.println(contains);
    }
}
