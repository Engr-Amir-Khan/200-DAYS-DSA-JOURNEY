package day1;

public class SumOfInteger {
    static void main(String[] args) {
        int num = 1222;
        int sum = 0 ;
        while(num!=0){

            int get = num%10;
             num/=10;
             sum += get;

        }
        System.out.println(sum);
    }
}
