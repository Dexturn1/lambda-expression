# Java Functional Programming (Java 8)

This repository contains **hands-on examples and notes** covering **Java Functional Programming concepts introduced in Java 8**, learned as part of the *Spring 7 & Spring Boot 4 for Beginners* course.

The focus is on **clean code**, **reduced boilerplate**, and **modern Java practices** using lambda expressions and functional interfaces.

---

## Topics Covered

### 1. Lambda Expressions

* Introduction to lambda expressions
* Syntax and structure
* Anonymous functions
* Parameter type inference
* Lambda expression simplification rules
* Replacing anonymous classes with lambdas
* Benefits:

  * Less boilerplate code
  * Better readability
  * Functional-style programming

---

### 2. Functional Interfaces

* Definition of a functional interface
* Rules:

  * Exactly **one abstract method**
  * Any number of default methods
  * Any number of static methods
* `@FunctionalInterface` annotation
* Compile-time safety using annotation
* Functional interfaces as **target types** for lambdas

---

### 3. Predefined Functional Interfaces (`java.util.function`)

#### Function

* `Function<T, R>`
* Takes input and returns output
* `apply()` method
* Use cases: transformation logic

#### Consumer

* `Consumer<T>`
* Takes input, returns nothing
* `accept()` method
* Use cases: printing, logging, side effects

#### Supplier

* `Supplier<T>`
* Takes no input, returns output
* `get()` method
* Use cases: object creation, lazy loading

---

### 4. Traditional Approach vs Lambda Expressions

* Implementing functional interfaces using:

  * Concrete classes (traditional way)
  * Lambda expressions (modern way)
* Comparison of verbosity
* Code reduction using lambdas

---

### 5. Method References

* Introduction to method references
* Replacing lambda expressions that only call methods
* `::` (double colon) operator
* Improved readability and maintainability

---

### 6. Types of Method References

#### a. Method Reference to a Static Method

```java
Math::sqrt
ClassName::staticMethod
```

#### b. Method Reference to an Instance Method of a Particular Object

```java
objectReference::instanceMethod
```

#### c. Method Reference to an Instance Method of an Arbitrary Object

```java
String::toLowerCase
String::compareToIgnoreCase
```

#### d. Method Reference to a Constructor

```java
HashSet::new
ClassName::new
```

---

### 7. Lambda to Method Reference Conversion

* When conversion is possible
* IntelliJ IDEA shortcut:

  * `Alt + Enter → Replace lambda with method reference`
* Rules for safe replacement

---

## Tools & Technologies

* Java 8+ (tested up to Java 21+)
* IntelliJ IDEA
* Java Standard Library (`java.util.function`)

---

## Learning Outcome

* Write clean, concise Java code
* Understand functional programming concepts
* Reduce boilerplate code
* Use modern Java features effectively
* Prepare for Spring Boot & Streams API

---

## Next Topics (Upcoming)

* Optional Class
* Default & Static Methods in Interfaces
* Streams API
* Collections vs Streams
* Functional Programming in Spring Boot

---

## Author

**Prabhat Kapkoti**
MCA | Java & Spring Boot Learner

---

## License

This project is for **learning and educational purposes**.
