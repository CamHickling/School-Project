public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;

    //constructor for class teacher, which holds fields first and last name, and subject
    Teacher (String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    //method to overwrite an existing java method to print name and subject instead of the memory address
    public String toString(){
        return "Name: " + firstName + " " + lastName + "\tSubject: " + subject;
    }
}