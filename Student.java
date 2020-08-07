public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    static int studentCounter = 0;
    private int studentNumber;

    //constructor for class student, which holds fields first and last name, and grade
    Student (String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade =  grade;
        this.studentNumber = studentCounter;
        studentCounter++;
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    //method to overwrite an existing java method to print name and grade instead of memory address
    public String toString(){
        return "Name: " + firstName + " " + lastName + "\tGrade: " + grade;
    }
}