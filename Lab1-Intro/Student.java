/**
 * Representation of student data in Java object form.
 * This example demonstrates the use of various types of constructors. In the programming
 * assignments, different constructors will be used at different times. It is essential to 
 * understand how instances of a class can be created, and its data members populated, with 
 * different constructors.
 *
 * Author: Matthew A. Turner
 * Date: August 30, 2019
 */
class Student {
    
    // Data members/attributes are outlined at the top of the file.
    String name;
    String program;
    String major;
    String type;
    int year;

    // Default constructor. All fields are empty.
    Student() { }
    
    // Constructor that takes a student name as only argument, leaving other fields empty.
    Student(String name) {
        this.name = name;
    }

    // Constructor that takes name, major, and year. Assumes it is an 
    // undergraduate student since no department is given.
    Student(String name, String majorOrDepartment, String type, int year) {

        this.name = name;
        this.major = major;
        this.year = year;
        if (type == "Undergraduate") {
            
        }
    }

    // Constructor that takes name, department, and year. Assumes it is a graduate student 
    // since no major is provided.
    Student(String name, String program, int year)
    {
       this.name = name;
       this.program = program;
       this.year = year;

       this.type = "Graduate";
    }
}
