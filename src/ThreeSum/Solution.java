package ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list1=new ArrayList<>();

        for(int i =0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    List<Integer> list=new ArrayList<>();
                    int s = nums[i] + nums[j] + nums[k];
                    if(s>0) break;
                    else if(i!=j && i!=k && j!=k && s== 0){
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                    }

                    if(list.isEmpty()){
                        continue;
                    }
                    else{
                        if(!list1.contains(list))
                            list1.add(list);

                    }
                }

            }
        }
        return list1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

}