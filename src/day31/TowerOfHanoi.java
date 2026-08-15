package day31;

public class TowerOfHanoi {
    static void main(String[] args) {
        hanoi(3, 'A', 'B', 'C');
    }

    public static void hanoi(int n, char a, char b, char c) {

        if(n==0) return;

        hanoi(n-1, a, c, b);
        System.out.println(a + " => " + c);
        hanoi(n-1, b,a,c);

    }




}
