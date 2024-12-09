package loopanddatatypes;

import java.util.Scanner;

public class ControlFlowDemo {
    Scanner scanner = new Scanner(System.in);

    void checkOddEven() {
        System.out.println("Enter your input integer");
        int input = scanner.nextInt();
        if (input % 2 == 0) {
            System.out.println("Entered input value is Even");
        } else {
            System.out.println("Entered input value is Odd");
        }
    }

    void findWeekDay() {
        System.out.println("Enter your input integer");
        int input = scanner.nextInt();
        switch (input) {
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
            case 1:
                System.out.println("Entered day is Monday");
                break;
            case 2:
                System.out.println("Entered day is Tuesday");
                break;
            case 3:
                System.out.println("Entered day is Wednesday");
                break;
            case 4:
                System.out.println("Entered day is Thursday");
                break;
            case 5:
                System.out.println("Entered day is Friday");
                break;
            case 6:
                System.out.println("Entered day is Saturday");
                break;
            case 7:
                System.out.println("Entered day is Sunday");
        }
    }

    void firstTenNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    void sumOfFirstFive() {
        int sum = 0;
        int i = 1;
        while (i <= 5) {
            sum += i;
            i++;
        }
        System.out.println("Sum of first 5 numbers is: " + sum);
    }

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


