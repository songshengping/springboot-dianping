package com.song.leetcode.leetcode1365;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Jeremy
 * @Description //TODO
 * @Date 2020-10-26 10:50
 **/
public class Leetcode1365_2 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int index = 0;
            while(index < nums.length){
                if (index != i && map.get(index) < nums[i]) {
                    count++;
                }
                index++;
            }
            result[i] = count;
        }

        return result;
    }
}
