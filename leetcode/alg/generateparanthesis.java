public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<String>();
        generate(l,"",n,n);
        return l;
    }
    public void generate(List l,String sub,int left,int right){
        if(left>right)
            return;
        if(left>0)
            generate(l,sub+"(",left-1,right);
        if(right>0)
            generate(l,sub+")",left,right-1);
        if(left==0&&right==0){
            l.add(sub);
            return;
        }
    }
}
