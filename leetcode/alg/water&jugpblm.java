public class Solution {
    public int gcd(int x,int y){
        if(y==0)
            return x;
        else{
            if(x<y)
                return gcd(y,x);
            else
                return gcd(y,x%y);
        }
    }
    public boolean canMeasureWater(int x, int y, int z) {
        int s = x+y; 
        int g = gcd(x,y);
        if(g==0&&z==0)
            return true;
        if(g==0&&z!=0)
            return false;
        if(z<=s&&z%g==0)
            return true;
        else
            return false;
    }
}
/*You are given two jugs with capacities x and y litres. There is an infinite amount of water supply available. You need to determine whether it is possible to measure exactly z litres using these two jugs.

If z liters of water is measurable, you must have z liters of water contained within one or both buckets by the end.

Operations allowed:

    Fill any of the jugs completely with water.
    Empty any of the jugs.
    Pour water from one jug into another till the other jug is completely full or the first jug itself is empty.

Example 1: (From the famous "Die Hard" example)

Input: x = 3, y = 5, z = 4
Output: True

Example 2:

Input: x = 2, y = 6, z = 5
Output: False
*/
