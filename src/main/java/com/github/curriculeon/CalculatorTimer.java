package com.github.curriculeon;

import java.util.function.BiFunction;

public class CalculatorTimer {
    private Calculator calculator;

    public CalculatorTimer(Calculator calculator) {
        this.calculator = calculator;
    }

    public double getTimeOfExecution(int x, int y, BiFunction<Integer, Integer, Integer> operation) {
        long startTime = System.currentTimeMillis();
        operation.apply(x, y);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        return totalTime;
    }

    public double add(int x, int y) {
        // :: is a method reference; we are referring to a preexisting method
        // BiFunction<Integer, Integer, Integer> methodToBeInvoked1 = calculator::add;
        // BiFunction<Integer, Integer, Integer> methodToBeInvoked2 = (a,b) -> calculator.add(x,y);
        // return getTimeOfExecution(x,y,methodToBeInvoked1);
        return getTimeOfExecution(x,y,calculator::add);
    }

    public double subtract(int x, int y) {
        return getTimeOfExecution(x,y,calculator::subtract);
    }

    public double multiply(int x, int y) {
        return getTimeOfExecution(x,y,calculator::multiply);
    }

    public double divide(int x, int y) {
        return getTimeOfExecution(x,y,calculator::divide);
    }
}

// method references / lambdas are _method invocation deferences_
    // it means we're not invoking the method where you see the lambda
    // we're creating a reference to the method so that it can be invoked later by something else

// what is dry code?
    // DO NOT REPEAT YOURSELF

// how do I dry out my code!?
    // you dry out code by identifying what is _different_
    // whatever is different is _varying_
    // _varying_ values are variables

// can I make the multiply,divide,add,subtract operations a variable?