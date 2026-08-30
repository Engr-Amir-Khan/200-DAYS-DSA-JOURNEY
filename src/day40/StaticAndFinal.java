package day40;


class Students{
    String name;
    static int gpa = 10;
    int rollnumber;
    final String uniName = "abc";

    Students(String n, int r){

        name = n;
        rollnumber = r;

    }

    void print(){
        System.out.println(name + " " + rollnumber + " " + gpa + " " + uniName);
    }

}
public class StaticAndFinal {


    static void main(String[] args) {
        Students s1 = new Students("amir", 3);
        Students s2 = new Students("khan",4);

        s1.print();
        s2.print();
    }
}
