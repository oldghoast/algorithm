package exercise0001;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Solution
 * @Description 1. 两数之和
 * @Author oldghoast
 * @date 9/8/21 2:16 PM
 * @Version 1.0
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 17;
        int[] result = twoSum(nums,target);
        System.out.println(result[0]+" "+result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[0] = map.get(target-nums[i]);
                result[1] = i;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}
