package day37;

class Student{
    String name;
    int rollNumber;
    String collegeName;
    double cgpa;

    void printStudentData(){
        System.out.println("Name is " + name + " rollNumber is " + rollNumber + " and College name is " + collegeName + " CGPA " + cgpa );
    }
}

public class OOPS {
    static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Ali";
        s1.collegeName = "xyz";
        s1.rollNumber =1233;
        s1.cgpa = 3.3;
        s1.printStudentData();

    }
}
