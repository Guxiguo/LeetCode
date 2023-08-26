package FurthestBuilding;

/**
 * 给你一个整数数组 heights ，表示建筑物的高度。另有一些砖块 bricks 和梯子 ladders 。
 * 你从建筑物 0 开始旅程，不断向后面的建筑物移动，期间可能会用到砖块或梯子。
 * 当从建筑物 i 移动到建筑物 i+1（下标 从 0 开始 ）时：
 * 如果当前建筑物的高度 大于或等于 下一建筑物的高度，则不需要梯子或砖块
 * 如果当前建筑的高度 小于 下一个建筑的高度，您可以使用 一架梯子 或 (h[i+1] - h[i]) 个砖块
 * 如果以最佳方式使用给定的梯子和砖块，返回你可以到达的最远建筑物的下标（下标 从 0 开始 ）。
 */

import java.util.PriorityQueue;

public class Solution {
    /**
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int count = 0;
        if(bricks==0&&ladders==0){
            for(int i=0;i<heights.length-1;i++){
                int temp = heights[i]-heights[i+1];
                if(temp>=0){
                    count = count+1;
                }
                else{
                    return count;
                }
            }

        }

        if(ladders == 0){
            for(int i=0;i<heights.length-1;i++){
                int temp = heights[i]-heights[i+1];
                bricks = bricks-temp;
                if(bricks>=0){
                    count=count+1;
                }
                else{
                    return count;
                }
            }
        }
        else{

            int[] max = new int[ladders];
            for(int j = 0;j<max.length;j++){
                max[j] = 0;
            }
            for(int i=0;i<heights.length-1;i++){
                int temp = heights[i]-heights[i+1];
                if(temp>=0){
                    count = count+1;
                }
                else{
                    int min = max[0];
                    int index = 0;
                    for(int n = 1;n<max.length;n++){
                        if(max[n]<min){
                            min = max[n];
                            index = n;
                        }
                    }
                    if(min < temp*(-1)){
                        bricks = bricks-min;
                        max[index] =temp*(-1);
                        if(bricks>=0){
                            count = count+1;
                        }
                        else{
                            return count;
                        }

                    }
                    else{
                        bricks = bricks+temp;
                        if(bricks>=0){
                            count = count+1;
                        }
                        else{
                            return count;
                        }

                    }
                }
            }
        }
        return count;
    }
     **/
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int ans=0;
        while(ans<heights.length-1){
            if(heights[ans]>=heights[ans+1]) ans++;
            else {
                int v=heights[ans+1]-heights[ans];
                queue.add(v);
                if(queue.size()>ladders) bricks-=queue.poll();
                if(bricks<0) {
                    return ans;
                }
                else{
                    ans++;
                }
            }
        }
        return ans;
    }
}
