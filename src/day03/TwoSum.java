package day03;

public class TwoSum {
    static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 2, 5};
        int target = 5;
        boolean isFound = false;
        int idx1 = -1;
        int idx2 = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    idx1 = i;
                    idx2 = j;
                    isFound = true;
                    break;
                }
            }
        }
        if(!isFound){
            System.out.println("not available");
        }else{
            System.out.println(idx1 + " and " + idx2 );
        }
    }
}
