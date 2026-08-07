package day2;

public class IsPrimeNumber {
    static void main(String[] args) {
        int number = 7;
        boolean isPrime = false;
        for (int i = 2; i < number; i++) {
            if(number%i==0){
                System.out.println("not prime number");
                isPrime = true;
            }
        }
        if(!isPrime){
            System.out.println("prime number");
        }
    }
}
