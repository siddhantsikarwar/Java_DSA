package loopanddatatypes;

import java.util.Scanner;

public class LoopAndDataTypesRunner {
    public static void main(String[] args) {
        // Running DataTypeDemo class methods
//        DataTypesDemo demo = new DataTypesDemo();
//        System.out.println("Age Difference: " + demo.getAgeDiff());
//        System.out.println("Sum of Numbers in Pool: " + demo.getSumPool());
//        System.out.println("Full Name: " + demo.getFullName());
//        System.out.print("Numbers in Pool: ");
//        demo.printNumPool();  // Demonstrates the array printing
//
//        // Running DataTypeDemo class methods
//        ControlFlowDemo controlFlowDemo = new ControlFlowDemo();
//        controlFlowDemo.checkOddEven();
//        controlFlowDemo.findWeekDay();
//        controlFlowDemo.firstTenNumbers();
//        controlFlowDemo.sumOfFirstFive();
//        controlFlowDemo.printHelloWorld();
//        controlFlowDemo.shutdown();

        // Running FactorialDemo class methods
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input value");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input format! Please try again");
        } else {
            int n = scanner.nextInt();
            FactorialDemo factorialDemo = new FactorialDemo();
            System.out.println("Factorial is: " + factorialDemo.calculateFactorial(n));
        }
    }
}