package com.java.lambda.functional;

import java.util.function.Consumer;

public class ConsumerDemo {
    static void main() {
        Consumer<String> printName = (s)-> System.out.println(s);
        printName.accept("Prabhat Kapkoti");
    }
}
