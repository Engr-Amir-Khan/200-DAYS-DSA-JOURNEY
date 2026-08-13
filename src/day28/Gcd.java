package day28;

public class Gcd {
    static void main(String[] args) {

        int a =20;
        int b=28;

        int Hcf = 0;
        for (int i = 1; i <=Math.min(a,b); i++) {

            if (a % i == 0 && b%i==0) {
                Hcf = i;
            }

        }


        System.out.println("HCF of these number is "+ Hcf);

    }
}
