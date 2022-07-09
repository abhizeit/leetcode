package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class InterSectionOfTwoArrays {
    static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList <Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1=0, p2=0;
        while(p1<nums1.length && p2<nums2.length) {
            if (nums1[p1] < nums2[p2]) {
                p1++;
            } else if (nums2[p2] < nums1[p1]) {
                p2++;
            } else {
                list.add(nums1[p1]);
                p1++;
                p2++;
            }
        }
        int[]arr = new int[list.size()];
        int i = 0;
        while (list.size()>i){
            arr[i]= list.get(i);
            i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[]nums1 ={4,9,5};
        int[] nums2 ={9,4,9,8,4};
        int[] ans = intersect(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }
}
