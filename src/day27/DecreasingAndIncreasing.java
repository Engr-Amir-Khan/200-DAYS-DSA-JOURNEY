package day27;

public class DecreasingAndIncreasing {
    static void main(String[] args) {
        incAndDec(5);
    }

    public static void incAndDec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        incAndDec(n-1);
        if(n!=1){
            System.out.println(n);


        }

    }
}
