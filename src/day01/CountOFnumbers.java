package day01;

public class CountOFnumbers {
    static void main(String[] args) {
        int num = 15436;

        int count = 0;
        while (num!=0){
            int digit = num % 10;
            num/=10;
            count++;

        }
        System.out.println(count);

    }
}
