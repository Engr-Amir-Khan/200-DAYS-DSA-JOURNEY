package day40;

class Animals{
    String name;
    int age;
}

class Birds extends Animals{
    int wings;
    void printDetail(){
        System.out.println(name + " " +  age + " " + wings);
    }
}
class Dog extends Animals{
    String barking;
}

public class Inheritence {
    static void main(String[] args) {
        Birds b1 = new Birds();
        b1.name = "sparrow";
        b1.age = 10;
        b1.wings = 2;
        b1.printDetail();

    }
}
