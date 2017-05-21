int uniquePathsWithObstacles(int** obstacleGrid, int obstacleGridRowSize, int obstacleGridColSize) {
    int matrix[obstacleGridRowSize][obstacleGridColSize];
    for(int i=0;i<obstacleGridRowSize;i++){
        for(int j=0;j<obstacleGridColSize;j++){
            if(obstacleGrid[i][j]==1){
                obstacleGrid[i][j]=-1;
                matrix[i][j] = -1;   
            }    
        }
    }
    int f=0;
    for(int i=0;i<obstacleGridRowSize;i++){
        if(f==0){
            if(obstacleGrid[i][0]==-1){
                f=1;
                matrix[i][0] = -1;
            }
            else
                matrix[i][0] = 1;
        }
        else
            matrix[i][0] = -1;
    }
    f=0;
     for(int i=0;i<obstacleGridColSize;i++){
        if(f==0){
            if(obstacleGrid[0][i]==-1){
                f=1;
                matrix[0][i] = -1;
            }
            else
                matrix[0][i] = 1;
        }
        else
            matrix[0][i] = -1;
    }  
    for(int i=1;i<obstacleGridRowSize;i++){
        for(int j=1;j<obstacleGridColSize;j++){
            if(obstacleGrid[i][j]!=-1){
                int l = matrix[i][j-1];
                int t = matrix[i-1][j];
                if(l!=-1&&t!=-1)
                    matrix[i][j] = l + t;
                else if(l==-1)
                    matrix[i][j] = t;
                else
                    matrix[i][j] = l;
            }   
        }
    }
    if(matrix[obstacleGridRowSize-1][obstacleGridColSize-1]==-1)
        return 0;
    return matrix[obstacleGridRowSize-1][obstacleGridColSize-1];
}

Follow up for "Unique Paths":

Now consider if some obstacles are added to the grids. How many unique paths would there be?

An obstacle and empty space is marked as 1 and 0 respectively in the grid.

For example,

There is one obstacle in the middle of a 3x3 grid as illustrated below.

[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]

The total number of unique paths is 2.

Note: m and n will be at most 100.
