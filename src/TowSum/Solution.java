package TowSum;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] list = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    list[0]=i;
                    list[1]=j;
                    break;
                }
            }

        }
        return list;
    }

}
