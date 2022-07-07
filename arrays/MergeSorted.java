package leetcode.arrays;

import java.util.Arrays;

public class MergeSorted {
    static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer1 = m - 1, pointer2 = n - 1, index = m + n - 1;
        while (pointer2 >= 0) {
            if (pointer1 >= 0 && nums1[pointer1] > nums2[pointer2]) {
                nums1[index--] = nums1[pointer1--];
            } else {
                nums1[index--] = nums2[pointer2--];
            }
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 0};
        int[] nums2 = {1};
        int m = 1;
        int n = 1;
        int[] ans = merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(ans));
    }
}
