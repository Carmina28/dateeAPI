package org.example;

import java.util.*;

public class TwoStreams {
    public static void main(String[] args) {
        System.out.println("Hola, mundo!");
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
