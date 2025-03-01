package codingQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringWithoutPreDefined {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        System.out.println(reverseString(inputString));
    }

    public static String reverseString(String input){
        char[] chars =input.toCharArray();
        int start=0, end= chars.length-1;
        String rev="";
        while(start<end){
            char temp= chars[start];
            chars[start]= chars[end];
            chars[end]= temp;
            start++;
            end--;
        }
        rev= Arrays.toString(chars);
        return  rev;
    }
}