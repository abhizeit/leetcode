package leetcode.arrays;

import java.util.Arrays;

public class RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
                nums[index]=nums[i];
            }
            else if(nums[i]!=nums[i+1]){
                nums[index]=nums[i];
                index++;
            }

        }
        return index+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}

