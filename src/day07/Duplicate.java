package day07;

public class Duplicate {
    static void main(String[] args) {
        int[]arr = {5,1,3,4,2,4};
        boolean a = false;
        int id  = 0;
        boolean[] flag = new boolean[arr.length];

        for (int i =0; i < arr.length-1; i++) {
            int elem = arr[i];
            if(flag[elem]){
                a = true;
                id = elem;
                break;
            }else {
                flag[elem] = true;

            }


        }

        System.out.println(id);


        for(boolean elem :  flag){
            System.out.print(elem +  " ");
        }
    }
}
