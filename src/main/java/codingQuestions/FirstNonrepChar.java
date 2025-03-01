package codingQuestions;

import java.util.HashMap;

public class FirstNonrepChar {

    public static void main(String args[]) {
       String input= "This world is a mystery";
       String[] str=input.split(" ");
       String rev="";
       for (String s:str){
           char[] ch=s.toCharArray();
               int left=0,right=ch.length-1;
               while(left<right){
                   char temp=ch[left];
                   ch[left]=ch[right];
                   ch[right]=temp;
                   left++;
                   right--;
               }
           //ch would be reversed
           rev= ch.toString();
           }
       }

    }



