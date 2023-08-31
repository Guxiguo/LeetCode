package SumOfPower;

import java.util.Arrays;

public class Solution {
    public static int sumOfPower(int[] nums) {
        Arrays.sort(nums);
        int dp = 0, preSum = 0;
        int res = 0, mod = 1000000007;
        for (int i = 0; i < nums.length; i++) {
            dp = (nums[i] + preSum) % mod;
            preSum = (preSum + dp) % mod;
            res = (int) ((res + (long) nums[i] * nums[i] % mod * dp) % mod);
            if (res < 0) {
                res += mod;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[] nums= new int[5];
        for(int i = 0;i<nums.length;i++){
            nums[i] = i;
        }
        System.out.println(sumOfPower(nums));
    }
}
