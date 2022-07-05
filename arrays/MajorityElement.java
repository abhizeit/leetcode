package leetcode.arrays;

import java.util.HashMap;

public class MajorityElement {
    static int solution(int[] nums) {

        //using hashmap
        int major = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (nums.length == 1) {
                major = nums[0];
                break;
            } else if (map.isEmpty()) {
                map.put(num, 1);
            } else {
                if (map.containsKey(num)) {
                    map.replace(num, map.get(num) + 1);
                } else map.put(num, 1);
                if (map.get(num) > nums.length / 2) {
                    major = num;
                    break;
                }
            }

        }
        System.out.println(map);
        return major;
//        int major = nums[0], count = 1;
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] == major) {
//                count++;
//            } else {
//                count--;
//                if (count == 0) {
//                    major = nums[i];
//                    count++;
//                }
//            }
//        }
//        return major;
    }

    public static void main(String[] args) {
        int[] nums = {15, 5, 5,1};
        int ans = solution(nums);
        System.out.println(ans);

    }
}

