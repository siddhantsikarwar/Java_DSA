package com.sdetprep.automation;

public class DataTypesDemo {
    int age= 19;
    int dadAge = 65 ;
    String name = "Ratan" ;
    int[] numPool= {1,2,3,4,5,6};

    int ageDiff = dadAge - age;

    int getAgeDiff(){
        return ageDiff ;
    }
    int sum=0;
    int getSumPool(){
        for (int num:numPool){
            sum= sum+=num;
        }
        return sum;
    }
    String getFullName(){
        return name.concat("Tata");
    }

}
