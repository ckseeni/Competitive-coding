 Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order.

Example 1:

Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output:  [1,2,4,7,5,3,6,8,9]
Explanation:

Note:

    The total number of elements of the given matrix will not exceed 10,000.
//not my solution
public class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return new int[0];
        int m = matrix.length, n = matrix[0].length;
        int dir = 0;
        int i = 0, j = 0;
        int[] res = new int[m * n];
        int k = 0;
        while(i >= 0 && i < m && j >= 0 && j < n) {
            do {
                res[k++] = matrix[i][j];
                if(dir == 0) {
                    i--;
                    j++;
                } else {
                    i++;
                    j--;
                }
            } while(i >= 0 && i < m && j >= 0 && j < n);
            if(dir == 0) {
                i++; j--;
                if(j != n - 1) j++;
                else i++;
            } else {
                i--; j++;
                if(i != m - 1) i++;
                else j++;
            }
            dir ^= 1;
        }
        return res;
    }
}
