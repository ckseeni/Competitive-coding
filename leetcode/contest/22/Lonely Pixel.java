public class Solution {
    public int findLonelyPixel(char[][] picture) {
        int row[] = new int[picture.length];
        int col[] = new int[picture[0].length];
        for(int i=0;i<picture.length;i++){
            for(int j=0;j<picture[0].length;j++){
                if(picture[i][j]=='B'){
                    row[i]++;
                    col[j]++;
                }
            }
        }
        int c = 0;
        for(int i=0;i<picture.length;i++){
            for(int j=0;j<picture[0].length;j++){
                if(picture[i][j]=='B'&&row[i]==1&&col[j]==1){
                    c++;
                }
            }
        }
        return c;
    }
}

Given a picture consisting of black and white pixels, find the number of black lonely pixels.

The picture is represented by a 2D char array consisting of 'B' and 'W', which means black and white pixels respectively.

A black lonely pixel is character 'B' that located at a specific position where the same row and same column don't have any other black pixels.

Example:

Input: 
[['W', 'W', 'B'],
 ['W', 'B', 'W'],
 ['B', 'W', 'W']]

Output: 3
Explanation: All the three 'B's are black lonely pixels.

Note:

    The range of width and height of the input 2D array is [1,500].

