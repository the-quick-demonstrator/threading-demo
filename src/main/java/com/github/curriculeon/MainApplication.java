package com.github.curriculeon;

public class MainApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        CalculatorTimer calculatorTimer = new CalculatorTimer(calculator);
        double totalTime = calculatorTimer.getTimeOfExecution(10,15,calculator::add);
        System.out.println("It took " + totalTime + " milliseconds");
    }
}
