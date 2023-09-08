package TotalHammingDistance;

/**
 * 两个整数的 汉明距离 指的是这两个数字的二进制数对应位不同的数量。
 *
 * 给你一个整数数组 nums，请你计算并返回 nums 中任意两个数之间 汉明距离的总和 。
 */
public class Solution {
    public int totalHammingDistance1(int[] nums) {
        int ans = 0, n = nums.length;
        for (int i = 0; i < 30; ++i) {
            int c = 0;
            for (int val : nums) {
                c += (val >> i) & 1;
            }
            ans += c * (n - c);
        }
        return ans;
    }

    public static int totalHammingDistance(int[] nums){
        int sum = 0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                sum = sum+distance(nums[i],nums[j]);
            }
        }
        return sum;


    }
    public static int distance(int x, int y){
        String binaryNumberOne = new StringBuilder(Integer.toBinaryString(x)).reverse().toString();

        String binaryNumberTwo = new StringBuilder(Integer.toBinaryString(y)).reverse().toString();

        int length = Math.max(binaryNumberOne.length(), binaryNumberTwo.length());

        int count = 0;
        for (int n = 0; n < length; n++) {
            char c1 = n<binaryNumberOne.length()?binaryNumberOne.charAt(n):'0';

            char c2 = n<binaryNumberTwo.length()?binaryNumberTwo.charAt(n):'0';


            if(c1!=c2){

                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] a = {4,2};
        System.out.println(totalHammingDistance(a));
    }



}
