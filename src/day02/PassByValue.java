package day02;

public class PassByValue {
    static void main(String[] args) {
        int z = 8;
        System.out.println(z);
        change(z);
        System.out.println(z);
    }
    public static void change(int d){
        d = 90;
    }
}
