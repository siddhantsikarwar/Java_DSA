package oopconcepts;

public class OOPConceptsRunner {
    public static void main(String[] args) {
        Person person = new Person("Alex",14);
        person.displayDetails();
        Student student = new Student("James",'B',12);
        student.displayDetails();
    }
}
