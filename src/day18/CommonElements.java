package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CommonElements {
    public static ArrayList<Integer> CommonEle(ArrayList<Integer>a, ArrayList<Integer>b){

        Collections.sort(a);
        Collections.sort(b);
        int y=0;
        int z = 0;
        ArrayList <Integer> ans = new ArrayList<>();

        while(y<a.size() || z<b.size()){

            if(y==a.size() || z==b.size()){
                break;
            }

            if(a.get(y) == b.get(z)){
                ans.add(a.get(y));
                y++;
                z++;

            }else if(a.get(y) < b.get(z)){
                y++;
            }else if(a.get(y) > b.get(z)){
                z++;
            }
        }
        return  ans;

    }
    static void main(String[] args) {
        ArrayList<Integer> b = new ArrayList<>();
        b.add(10);
        b.add(-1);
        b.add(2);
        b.add(90);
        b.add(49);
        b.add(100);
        b.add(120);
        System.out.println(b);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(10);
        ans.add(-1);
        ans.add(49);
        ans.add(2);
        ans.add(22);

        ans.add(120);
        System.out.println(ans);

        System.out.println();
        System.out.println("after ");

        ArrayList<Integer> function = CommonEle(b,ans);
        System.out.println(function);




    }
}
