import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,3};
        System.out.println(Arrays.toString(Solution.twoSum(nums, 6)));

    }
}

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++){
            int j=0;
            while(j<nums.length){
                if (i == j) {
                    j++;
                }
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
                j++;
            }
        }
        return null;
    }
}