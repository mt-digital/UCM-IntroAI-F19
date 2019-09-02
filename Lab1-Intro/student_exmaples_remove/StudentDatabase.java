import java.util.*;


class StudentDatabase {

    Student[] students;
    ArrayList<Student> undergraduate;
    ArrayList<Student> graduate;
    
    StudentDatabase(Student[] students)
    {

    }

    void addStudent(Student student) {
        // Add student to either the undergraduate or graduate student lists.
        if (student.type == "Undergraduate") {
            undergraduate.add(student);
        }
        else if (student.type == "Graduate") {
            graduate.add(student);
        }
        else {
            
        }
    }

    void printStudents() {

        System.out.println("Undergraduate students:\n");
        for (Student student : this.undergraduate) {

        }

        System.out.println("Graduate students:\n");
        for (Student student : this.graduate) {
            
        }
        // Alternative to for (int i; i <= this.graduate.length; i++) { ... }.
    }
}
