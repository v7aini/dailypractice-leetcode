package day14;
import java.util.Arrays;
public class assigncookie455 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] g = {1, 2};
        int[] s = {1, 2,3};
        System.out.println(solution.findContentChildren(g, s));
    }
    
}
   
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int m= g.length;
        int n= s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        int cmt=0;
        while(i<m && j<n){
            if(s[j] >=g[i]){
                cmt++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return cmt;
    }
}