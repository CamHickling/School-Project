public class Main {
    public static void main(String[] args) {
        School s = new School("Point Grey Secondary", "5350 East Boulevard Vancouver, V6M 3V2", "604-713-8220");
        s.addStudent("a","b", 1);
        s.addStudent("c","d", 2);
        s.addStudent("e","f", 3);
        s.addStudent("g","h", 4);
        s.addStudent("i", "j", 5);
        s.addStudent("k","l", 6);
        s.addStudent("m","n", 7);
        s.addStudent("o","p", 8);
        s.addStudent("q","r", 9);
        s.addStudent("s", "t", 10);
        s.addTeacher("u","v", "Math");
        s.addTeacher("w","x", "Science");
        s.addTeacher("y","z", "Socials");
        System.out.println("\nList of students: ");
        System.out.println(s.showStudents());
        System.out.println("\nList of teachers: ");
        System.out.println(s.showTeachers());
        System.out.println("\nDelete student:\tName: k l\tGrade: 6");
        s.deleteStudent("k","l", 6);
        System.out.println("\nDelete student:\tName: q r\tGrade: 9");
        s.deleteStudent("q","r", 9);
        System.out.println("\nDelete teacher:\tName: u v\tSubject: Math");
        s.deleteTeacher("u", "v", "Math");
        System.out.println("\nList of students: ");
        System.out.println(s.showStudents());
        System.out.println("\nList of teachers: ");
        System.out.println(s.showTeachers());
    }
}