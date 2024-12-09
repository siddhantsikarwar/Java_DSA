package oopconcepts;

public class Student extends Person {


    private char grade;

    public Student(String name, char grade, int age) {
        super(name,age);
        this.grade = grade;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student's details are - Name: " + getName() + ", Age: " + getAge() + ", Grade: " + getGrade());
    }

}
