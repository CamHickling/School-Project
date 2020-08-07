import java.util.ArrayList;

public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList courses = new ArrayList<>();
    String name;
    String location;
    String phoneNumber;

    //constructor for class school, holds the fields: name, location, and phone number
    School(String name, String location, String phoneNumber){
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //add a teacher to the school
    public void addTeacher(String firstName, String lastName, String subject) {
        Teacher t = new Teacher(firstName, lastName, subject);
        teachers.add(t);
    }

    //add a student to the school
    public void addStudent(String firstName, String lastName, int grade) {
        Student st = new Student(firstName, lastName, grade);
        students.add(st);
    }

    //delete a teacher from the school
    public void deleteTeacher(String firstName, String lastName, String subject) {
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getFirstName().equals(firstName) && teachers.get(i).getLastName().equals(lastName) && teachers.get(i).getSubject().equals(subject)) {
                teachers.remove(i);
            }
        }
    }

    //delete a student from the school
    public void deleteStudent(String firstName, String lastName, int grade) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFirstName().equals(firstName) && students.get(i).getLastName().equals(lastName) && students.get(i).getGrade() == grade) {
                students.remove(i);
            }
        }
    }

    //method to return a string of all the teachers in the school list
    public String showTeachers() {
        String allTeachers = "";
        for (int i = 0; i < teachers.size(); i++) {
            allTeachers += "\n" + teachers.get(i);
        }
        return allTeachers;
    }

    //method to return a string of all the students in the school list
    public String showStudents(){
        String allStudents = "";
        for (int i = 0; i < students.size(); i++) {
            allStudents += "\n" + students.get(i);
        }
        return allStudents;
    }
}