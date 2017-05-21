public class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int r = dungeon.length;
        int c = dungeon[0].length;
        int cost[][] = new int[r][c];
        cost[r-1][c-1] = Math.max(1-dungeon[r-1][c-1],1);
        for(int i=r-2;i>=0;i--)
            cost[i][c-1] =Math.max(cost[i+1][c-1]-dungeon[i][c-1],1);
        for(int j=c-2;j>=0;j--)
            cost[r-1][j] = Math.max(cost[r-1][j+1]-dungeon[r-1][j],1);
        for(int i=r-2;i>=0;i--){
            for(int j=c-2;j>=0;j--){
                int down = Math.max(cost[i+1][j]-dungeon[i][j],1);
                int right = Math.max(cost[i][j+1]-dungeon[i][j],1);
                cost[i][j]  = Math.min(down,right);
            }
        }
        return cost[0][0];
    }
}
