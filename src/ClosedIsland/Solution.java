package ClosedIsland;

class Solution {
    public int closedIsland(int[][] grid) {
        int total = 0;
        for(int i =0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if (grid[i][j] != 1 && dfs(i, j, grid)) {
                    total++;
                }
            }
        }
        return total;
    }
    public boolean dfs(int i,int j,int[][] grid){
        if(grid[i][j]==1){
            return true;
        }
        if(grid[i][j] ==0&&(i==0||i==grid.length-1||j==0||j==grid[0].length-1)){
            return false;
        }

        grid[i][j] = 1;

        int[][] direct = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        boolean res = true;


        for (int[] dir : direct) {
            int x = dir[0] + i;
            int y = dir[1] + j;
            res &= dfs(x, y, grid);
        }

        return res;
    }
}
