package leetcode.arrays;

import java.util.Arrays;

public class MergeSorted {
    static int[] merge(int[] nums1, int m, int[] nums2,int n) {
        for(int i=0;i<n ;i++){
            for(int j=0;j<m;j++){
                if(nums2[i]<=nums1[j]){
                    int temp=nums1[j];
                    nums1[j]=nums2[i];
                    for(int k =j+1;k<n+1;k++){
                        int temp2 = nums1[k];
                        nums1[k]= temp;
                        temp=temp2;
                    }
                }

            }
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[]nums1 ={1,6,9,0,0,0,0};
        int[]nums2 = {2,3,4,5};
        int m=7;
        int n=4;
        int [] ans = merge(nums1,m,nums2 ,n);
        System.out.println(Arrays.toString(ans));
        System.out.println(nums1[7]);
    }
}
