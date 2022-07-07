package leetcode.arrays;

import java.util.Arrays;

public class TwoSum {

    public static int[] twosum(int[] arr, int target) {
             
        //USING ITERATIVE APPROACH
//         int[] result = {-1, -1};
//        int[] result = new int[2];
//        for(int i=0;i<arr.length-1;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]+arr[j]==target){
//                    result[0]=i;
//                    result [1]=j;
//                    return result;
//                }
//            }
        
        //USING TWO POINTER APPROACH
        int[] result = {-1, -1};
        int i = 0;
        int j = arr.length - 1;
        while (i != j) {
            if (arr[i] + arr[j] == target) {
                result[0] = i;
                result[1] = j;
                return result;
            } else if (arr[i] + arr[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {2, 6, 4, 5};
        int target = 10;
        int[] ans = twosum(nums, target);
        System.out.println(Arrays.toString(ans));
    }
}
