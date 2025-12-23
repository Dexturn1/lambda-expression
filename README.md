# Java Lambda Expressions – Lecture Notes

This repository contains my learning notes and practice code from the **Java Lambda Expressions** lecture, part of the *Spring & Spring Boot for Beginners* course.

---

## Topics Covered

### 1. Lambda Expressions (Java 8+)

* Introduced in Java 8
* Enable functional programming in Java
* Represent **anonymous functions**
* Do not belong to any class or object
* Mainly used to implement **functional interfaces**

---

### 2. Functional Interfaces

* An interface with **exactly one abstract method**
* Can have:

  * Multiple `default` methods
  * Multiple `static` methods
* Used as the target type for lambda expressions

Example:

```java
@FunctionalInterface
interface Shape {
    void draw();
}
```

---

### 3. Lambda Expression Syntax

General form:

```java
(parameters) -> expression
```

or

```java
(parameters) -> {
    statements;
}
```

Parts:

1. Parameter list
2. Arrow operator `->`
3. Lambda body

---

### 4. Traditional Approach vs Lambda

**Traditional Implementation**

```java
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
```

**Using Lambda Expression**

```java
Shape rectangle = () -> System.out.println("Rectangle");
```

Benefits:

* Less boilerplate code
* Cleaner and more readable
* Functional style programming

---

### 5. Lambda with Parameters

Functional Interface:

```java
interface Addition {
    int add(int a, int b);
}
```

Lambda Implementation:

```java
Addition addition = (a, b) -> a + b;
System.out.println(addition.add(10, 20));
```

Notes:

* Parameter types can be omitted
* Return type is inferred by the compiler

---

### 6. Lambda with Multiple Statements

```java
Addition addition = (a, b) -> {
    int sum = a + b;
    return sum;
};
```

---

### 7. Passing Lambda as Method Parameter

```java
static void printShape(Shape shape) {
    shape.draw();
}
```

Usage:

```java
printShape(() -> System.out.println("Circle"));
```

This demonstrates **passing behavior as a parameter**.

---

### 8. Lambda with Runnable Interface

**Traditional Way**

```java
class ThreadDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread running");
    }
}
```

**Using Lambda**

```java
Thread t = new Thread(() -> System.out.println("Thread running"));
t.start();
```

Runnable is a functional interface, so it works with lambdas.

---

### 9. Key Differences: Method vs Lambda

| Feature          | Method   | Lambda       |
| ---------------- | -------- | ------------ |
| Name             | Required | Not required |
| Belongs to class | Yes      | No           |
| Return type      | Explicit | Inferred     |
| Boilerplate      | More     | Less         |

---

## Key Takeaways

* Lambda expressions work only with functional interfaces
* They reduce boilerplate code
* Used heavily with:

  * Threads
  * Collections
  * Streams
  * Callbacks
* Java compiler infers parameter and return types

---

## Next Topics

* Method References
* Optional Class
* Default and Static Methods in Interfaces
* Streams API

---

## Author

Prabhat Kapkoti

