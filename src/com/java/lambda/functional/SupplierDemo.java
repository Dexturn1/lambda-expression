package com.java.lambda.functional;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDemo {
    static void main() {
        Supplier<LocalDateTime> supplier = LocalDateTime::now;
        System.out.println(supplier.get());
    }

}
