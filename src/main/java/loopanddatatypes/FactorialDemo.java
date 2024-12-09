package loopanddatatypes;

public class FactorialDemo {
    int calculateFactorial(int n) {
        if(n<0){
            System.out.println("Invalid input value");
            return -1;
        }
        else if(n==0 || n==1){
            return 1;
        }
        else if(n>20){
            System.out.println("Input value is out of range, please enter value between 0 & 20");
            return -1;
        }
        else return n * calculateFactorial(n-1);
    }
}