package ThreeSumClosest;

import java.util.Arrays;

/**
 * 给你一个长度为 n 的整数数组 nums 和 一个目标值 target。请你从 nums 中选出三个整数，使它们的和与 target 最接近。
 *
 * 返回这三个数的和。
 *
 * 假定每组输入只存在恰好一个解。
 */
public class Solution {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int i = nums.length;


        int minValue = 100000;
        int value1 =0;
        for(int j=0;j<i-2;j++){
            for(int n=j+1;n<i-1;n++){
                for(int m =j+2;m<i;m++){
                    int value = nums[j]+nums[n]+nums[m];
                    if(Math.abs(value-target)<minValue){
                        value1=value;
                        minValue = Math.abs(value-target);
                    }
                    if(value1==target){
                        break;
                    }
                }
                if(value1==target){
                    break;
                }
            }
            if(value1==target){
                break;
            }

        }
        return value1;
    }

    public static void main(String[] args) {
        int[] nums = {-1000,-1000,-1000};
        System.out.println(threeSumClosest(nums,10000));
    }
}
