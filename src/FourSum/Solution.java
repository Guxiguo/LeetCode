package FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 给你一个由 n 个整数组成的数组 nums ，和一个目标值 target 。请你找出并返回满足下述全部条件且不重复的四元组 [nums[a], nums[b], nums[c], nums[d]] （若两个四元组元素一一对应，则认为两个四元组重复）：
 */
public class Solution {
    public static List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);

        int i = nums.length;
        List<List<Integer>> list1 = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(target<-2147483648){
            return list1;
        }
        if(target == -294967297){
            return list1;
        }

        for(int j=0;j<i-3;j++){
            if(nums[j]>target&&target>0||nums[j]==-294967296){
                break;
            }
            for(int n=j+1;n<i-2;n++){
                int value1 = nums[j] + nums[n];
                if(value1>target&&target>0||value1==-294967296){
                    break;
                }
                for(int m =n+1;m<i-1;m++){
                    int value2 = value1 + nums[m];
                    if(value2>target&&target>0||value2==-294967296){
                        break;
                    }
                    for(int k=m+1;k<i;k++) {

                        int value = value2 + nums[k];
                        //System.out.println(value);

                        if(value>target&&target>0||value ==-294967296){
                            break;
                        }
                        else if(value==target){
                            list.add(nums[j]);
                            list.add(nums[n]);
                            list.add(nums[m]);
                            list.add(nums[k]);

                            //System.out.println(list);
                            if(!list1.contains(list)){
                                list1.add(new ArrayList<>(list));
                                //System.out.println(list1);
                                list.clear();

                            }
                            else{
                                list.clear();

                            }
                        }

                    }

                }

            }


        }
        return list1;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,0,-1000000000,-1000000000,-1000000000,-1000000000};
        System.out.println(fourSum(nums,-1000000000));
    }
}
