package FrequencySort;

/**
 * 给你一个整数数组 nums ，请你将数组按照每个值的频率 升序 排序。如果有多个值的频率相同，请你按照数值本身将它们 降序 排序。
 */


import java.util.*;

public class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        for (int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        Arrays.sort(arr,(o1, o2) -> Objects.equals(map.get(o1), map.get(o2)) ?o2-o1:map.get(o1)-map.get(o2));
        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }
}
