package algorithm;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author fyc
 * @date 2021-5-12
 * 两数之和
 */
public class TwoSum {

    /**
     * 暴力枚举法
     * @param nums
     * @param target
     * @return
     */
    public static int[] enumeration(int[] nums,int target){
        int[] res = new int[2];
        boolean isFind = false;

        for (int i = 0; i < nums.length; i++) {
            int currNum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int currTarget = currNum + nums[j];
                if (currTarget == target) {
                    res[0] = i;
                    res[1] = j;
                    isFind = true;
                } else {
                    continue;
                }
            }
            if(isFind){
                break;
            }else {
                continue;
            }
        }
        System.out.println("["+res[0]+","+res[1]+"]");
        return res;
    }

    public static int[] hashMap(int[] nums,int target){
        int[] result = new int[]{0, 1};
        if(nums.length==2){
            return result;
        }
        HashMap<Integer, Integer> map = new HashMap(16);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i );
        }
        for (int i = 0; i < nums.length; i++) {
            if(map.get(target-nums[i])!=null){
                result[0]=i;
                result[1] = map.get(target-nums[i]);
                if(result[0]!=result[1]){
                    break;
                }
            }
        }
        System.out.println("["+result[0]+","+result[1]+"]");
        return result;

    }

    public static int[] doublePointer(int[] nums,int target){
        int[] result = new int[]{-1, -1};
        if (nums.length == 2) {
            return new int[]{0, 1};
        }
        int[] team = Arrays.copyOf(nums, nums.length);
        Arrays.sort(team);
        int l = 0;
        int r = nums.length - 1;
        while (true) {
            if (team[l] + team[r] > target) {
                r--;
                continue;
            }
            if (team[l] + team[r] < target) {
                l++;
                continue;
            }
            if (team[l] + team[r] == target) {
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == team[l] && result[0] == -1) {
                result[0] = i;
                continue;
            }
            if (nums[i] == team[r] && result[1] == -1) {
                result[1] = i;
            }
        }
        return result;
    }



    public static void main(String[] args) {

    }

}
