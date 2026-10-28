package day9;

public class numberofgoodpair1512 {
    
}
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int answer = 0 , count[] =new int[101];
        for(int a:nums){
            answer+= count[a]++;
        }
        return answer;
    }
}
