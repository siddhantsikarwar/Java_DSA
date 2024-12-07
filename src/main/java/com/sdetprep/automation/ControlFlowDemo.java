package com.sdetprep.automation;

import java.util.Scanner;

public class ControlFlowDemo {
    Scanner scanner = new Scanner(System.in);

    /**
     * Checks if an integer is odd or even and prints the result.
     */
    void checkOddEven() {
        System.out.println("Enter your input integer:");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next();  // Clear invalid input
            return;
        }
        int input = scanner.nextInt();
        if (input % 2 == 0) {
            System.out.println("Entered input value is Even");
        } else {
            System.out.println("Entered input value is Odd");
        }
    }

    /**
     * Finds and prints the day of the week based on an integer input.
     */
    void findWeekDay() {
        System.out.println("Enter your input integer:");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next();  // Clear invalid input
            return;
        }
        int input = scanner.nextInt();
        switch (input) {
            case 1 -> System.out.println("Entered day is Monday");
            case 2 -> System.out.println("Entered day is Tuesday");
            case 3 -> System.out.println("Entered day is Wednesday");
            case 4 -> System.out.println("Entered day is Thursday");
            case 5 -> System.out.println("Entered day is Friday");
            case 6 -> System.out.println("Entered day is Saturday");
            case 7 -> System.out.println("Entered day is Sunday");
            default -> System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
    }

    /**
     * Prints numbers from 1 to 10 using a for loop.
     */
    void firstTenNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    /**
     * Calculates and prints the sum of the first 5 positive integers.
     */
    void sumOfFirstFive() {
        int sum = 0;
        int i = 1;
        while (i <= 5) {
            sum += i;  // Fix: Accumulate sum correctly
            i++;
        }
        System.out.println("Sum of first 5 numbers is: " + sum);
    }

    /**
     * Prints "Hello World" 5 times using a do-while loop.
     */
    void printHelloWorld() {
        int i = 0;
        do {
            i++;
            System.out.println("Hello World");
        } while (i < 5);
    }

    /**
     * Closes the scanner to avoid resource leaks.
     */
    void shutdown() {
        scanner.close();
    }
}