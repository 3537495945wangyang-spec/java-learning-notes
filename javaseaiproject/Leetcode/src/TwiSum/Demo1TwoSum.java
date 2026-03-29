package TwiSum;

import java.util.HashMap;
import java.util.Map;

public class Demo1TwoSum {
    public static void main(String[] args) {
        int nums[] = {5,9,6,8,2,1,4};
        int target = 10;
        int result[] = twoSumpro(nums,target);
        System.out.println("{"+result[0]+","+result[1]+"}");

    }

    public static int[] twoSum(int[] nums, int target) {
        int result[] = {0,0};
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if(nums[i]+nums[j]==target){
                    result = new int[]{i, j};
                    return result;
                }
            }

        }
        return result;
    }
    public static int[] twoSumpro(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            int currentNum = nums[i];
            int marchNum = target - currentNum;
            if(map.containsKey(marchNum)){
                return new int[]{map.get(marchNum),i};
            }
            map.put(currentNum,i);


        }return new int[]{0,0};
    }
}
