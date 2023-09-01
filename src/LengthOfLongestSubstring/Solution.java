package LengthOfLongestSubstring;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */

import java.util.HashSet;
import java.util.Set;

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        //维护当前最长不重复字符子串
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 0;
        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
                //未查到重复字符就一直加，right右移
                set.add(s.charAt(right));
                right++;
            }else{
                //right查到重复字符先不动，left右移，set删left经过的字符，直到重复的这个字符删掉为止
                set.remove(s.charAt(left));
                left++;
            }
            //每一次计算当前set子串的长度
            max = Math.max(max, set.size());
        }
        return max;
    }

    public static void main(String[] args) {
        String s = " ";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
