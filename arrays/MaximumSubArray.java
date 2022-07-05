package leetcode.arrays;

public class MaximumSubArray {
    static int maxSum(int[] arr, int index, int max) {
        if(index==arr.length-1){
            return max;
        }
            int sum = 0;
            for (int j = index; j < arr.length; j++) {
                sum += arr[j];
                if (sum > max) {
                    max = sum;
                }
            }
        return maxSum(arr, index+1, max);
    }

    public static void main(String[] args) {
        int[] arr = {4, -5, -2, 7, 1, 9};
        int ans = maxSum(arr,0,arr[0]);
        System.out.println(ans);
    }
}
