package com.java.lambda;

class ThreadDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("run method called...");
    }
}


public class RunnableLambdaExample {
    static void main() {
        Thread thread = new Thread(new ThreadDemo());
        thread.start();


        Runnable runnable = () ->System.out.println("run method called using lambda.... ");
        Thread threadLmbda = new Thread(runnable);
        threadLmbda.start();


        Thread threadLambda = new Thread(()-> System.out.println("running method lambda without storing it in the variable"));
        threadLambda.start();

    }
}