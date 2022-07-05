package leetcode.arrays;

import java.util.Arrays;

public class PlusOne {
    static int[] plusOne(int[] digits) {
        long n = 0;
        for (int digit : digits) {
            n = n * 10 + digit;
        }
        System.out.println(n);
        int l;
        if(n==9){
            l=2;
        }
        else if (n%9==0 && (n+1) % 10 == 0) l = digits.length+1;
        else {
            l = digits.length;
        }
        int[] arr = new int[l];
        long output = (n + 1);
        while (output!=0) {
            arr[l-1] = (int) (output % 10);
            output = output / 10;
            l--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {9,9,9,9,9,9,9,9,9,9};
        int[] ans = plusOne(arr);
        System.out.println(Arrays.toString(ans));
        int[]emp = new int[2];
        System.out.println(Arrays.toString(emp));
    }
}
