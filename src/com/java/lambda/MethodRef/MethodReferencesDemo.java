package com.java.lambda.MethodRef;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;



@FunctionalInterface
interface Printable{
    void print(String msg);
}



public class MethodReferencesDemo {

    public void display(String msg){
        msg = msg.toUpperCase();
        System.out.println(msg);
    }


    public  static int addition(int a, int b){
        return a+b;
    }


    static void main() {


        // 1. Method Reference to a static metod
        // using lambda expression
        Function<Integer, Double> function = (input)-> Math.sqrt(input);
        System.out.println(function.apply(4));

        // using method referance
        Function<Integer, Double> functionMethodRef = Math::sqrt;
        System.out.println(functionMethodRef.apply(4));


        // using lambda expression
        BiFunction<Integer, Integer, Integer> biFunctionLambda = (a,b) -> MethodReferencesDemo.addition(a,b);
        System.out.println(biFunctionLambda.apply(12,2));

        // now we use the method references
        BiFunction<Integer, Integer, Integer> biFunctionMethodRef = MethodReferencesDemo::addition;
        System.out.println(biFunctionMethodRef.apply(12,4));


        // 2. Method Reference to an instance method of and object
        MethodReferencesDemo  methodReferencesDemo = new MethodReferencesDemo();

        // lambda expression
        Printable printable = (msg)-> methodReferencesDemo.display(msg);
        printable.print("Prabhat");

        // using method reference
        Printable printableMethodRef = methodReferencesDemo::display;
        printableMethodRef.print("kapkoti");

        // 3. Reference to the instance of an arbitrary object sometimes, we call a method of argument in the lambda
        // expression.  In that case, we can use a method reference to call an instance method of an arbitrary object
        // of a specific type.

        Function<String, String> stringFunction = input-> input.toLowerCase();
        System.out.println(stringFunction.apply("PRABHAT KAPKOTI"));

        Function<String, String> stringStringFunction = String::toLowerCase;
        System.out.println(stringStringFunction.apply("REFERANCE TO THE INSTANCE OF AN ARBITRARY OBJECT SOMETIMES"));

        // using lambda expression
        String[] strArray = {"A", "E", "I", "O", "U", "a", "e", "i", "o", "u"};

        //  using method reference
        Arrays.sort(strArray, String::compareToIgnoreCase);


        // 4. reference to a constructor
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("Banana");
        fruits.add("mango");
        fruits.add("watermelon");


        Function<List<String>, Set<String>> setFunction = fruitsList-> new HashSet<>(fruitsList);
        System.out.println(setFunction.apply(fruits));


        // using the method refrence
        Function<List<String>, Set<String>> setFunctionMethodRef = HashSet::new;
        System.out.println(setFunctionMethodRef.apply(fruits));



    }

}
















