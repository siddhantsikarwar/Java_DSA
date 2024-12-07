package com.sdetprep.automation;

public class Main {
    public static void main(String[] args) {
        // Running DataTypeDemo class methods
        DataTypesDemo demo = new DataTypesDemo();
        System.out.println("Age Difference: " + demo.getAgeDiff());
        System.out.println("Sum of Numbers in Pool: " + demo.getSumPool());
        System.out.println("Full Name: " + demo.getFullName());
        System.out.print("Numbers in Pool: ");
        demo.printNumPool();  // Demonstrates the array printing

        // Running DataTypeDemo class methods
        ControlFlowDemo controlFlowDemo = new ControlFlowDemo();
        controlFlowDemo.checkOddEven();
        controlFlowDemo.findWeekDay();
        controlFlowDemo.firstTenNumbers();
        controlFlowDemo.sumOfFirstFive();
        controlFlowDemo.printHelloWorld();
        controlFlowDemo.shutdown();

    }
}