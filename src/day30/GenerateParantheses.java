package day30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParantheses {



    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();


        List<String> ans = new ArrayList<>();
        generate(n, 0, 0, "", ans);
        System.out.print(ans + " ");

    }






    //my own built in function
    public static  List<String> generate(int n, int left, int right, String s,List<String>ans){



        //this is base case
        if(right==n){
            ans.add(s);
            return ans;
        }

        if(left < n){
            generate(n, left+1, right, s+"(",ans);
        }

        if(right < left){
            generate(n, left, right+1, s+")",ans);
        }


        return ans;

    }
}
