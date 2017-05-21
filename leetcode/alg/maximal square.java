 Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.

For example, given the following matrix:
			0 0 0 0 0 0
1 0 1 0 0   0 1 0 1 0 0
1 0 1 1 1   0 1 0 1 1 1 
1 1 1 1 1-> 0 1 1 1 2 2
1 0 0 1 0   0 0 1 0 0 0

Return 4. 
public int maximalSquare(char[][] a) {
    if(a.length == 0) return 0;
    int m = a.length, n = a[0].length, result = 0;
    int[][] b = new int[m+1][n+1];
    for (int i = 1 ; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            if(a[i-1][j-1] == '1') {
                b[i][j] = Math.min(Math.min(b[i][j-1] , b[i-1][j-1]), b[i-1][j]) + 1;
                result = Math.max(b[i][j], result); // update result
            }
        }
    }
    return result*result;
}

Top, Left, and Top Left decides the size of the square. If all of them are same, then the size of square increases by 1. If they're not same, they can increase by 1 to the minimal square. If you take an example and work it out, it'll be much easier to understand when it comes to dynamic programing. :)

			0 0 0 0 0 0
1 0 1 0 0   0 1 0 1 0 0
1 0 1 1 1   0 1 0 1 1 1 
1 1 1 1 1-> 0 1 1 1 2 2
1 0 1 1 1   0 0 1 1 2 3

int max(int a,int b){
    return a>b ? a:b;
}
int min(int a,int b){
    return a<b ? a:b;
}
int maximalSquare(char** matrix, int matrixRowSize, int matrixColSize) {
    int i,j,result=0;
    if(matrixRowSize==0)
        return 0;
    int dp[matrixRowSize+1][matrixColSize+1],m[matrixRowSize][matrixColSize];
    for(i=0;i<matrixRowSize;i++){
        for(j=0;j<matrixColSize;j++){
            m[i][j] = (int)matrix[i][j]-48;
            printf("%d ",m[i][j]);
        }
        printf("\n");
    }
     for(i=0;i<=matrixRowSize;i++){
        for(j=0;j<=matrixColSize;j++){
           dp[i][j]=0;
        }
        
    }
    for(i=1;i<=matrixRowSize;i++){
        for(j=1;j<=matrixColSize;j++){
            if(m[i-1][j-1]==1){
                dp[i][j] = min(min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]) + 1;
                result = max(result,dp[i][j]);
            }
            printf("%d ",dp[i][j]);
        }
        printf("\n");
    }
    return result*result;
}
