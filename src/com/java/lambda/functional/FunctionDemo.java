package com.java.lambda.functional;

import java.util.function.Function;

public class FunctionDemo {
    static void main() {
        Function<String, Integer> function = String::length;
        System.out.println(function.apply("Prabhat Kapkoti"));
    }

}
