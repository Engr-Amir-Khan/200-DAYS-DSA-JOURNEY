package day40;

abstract class Insects{
    void eating(){
        System.out.println("ANIMAL IS EATING");
    }
}

class Snake extends Insects{
    String bite;
    void biting(){
        System.out.println("snake is biting");
    }
}
public class Abstraction {
    static void main(String[] args) {
        Snake one = new Snake();
        one.biting();
        one.eating();
    }
}
