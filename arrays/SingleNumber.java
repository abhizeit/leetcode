package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.remove(num);
            }else{
                map.put(num,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            return entry.getKey();
        }

        return -1;
    }

    public static void main(String[] args) {
        int [] nums ={4,4,4,3,2};
        int ans = singleNumber(nums);
        System.out.println(ans);
    }
}
