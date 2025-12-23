package com.java.lambda;

interface Shape{
    void draw();
}

public class LambdaExample {
    public static void main(String[] args) {

        String str = "Hello";
        Shape rectangle =()-> System.out.println("Rectangle Class: draw() method");
        //rectangle.draw();

        Shape square = ()-> System.out.println("Square Class: draw() method");
        //square.draw();

        Shape circle = ()-> System.out.println("circle class: draw() method");
        //circle.draw();


        print(()-> System.out.println("Rectangle class : draw() method"));
        print(()-> System.out.println("Square class: draw() method"));

        print(rectangle);
        print(square);
        print(circle);
    }

    private static void print(Shape shape){
        shape.draw();
    }
}
