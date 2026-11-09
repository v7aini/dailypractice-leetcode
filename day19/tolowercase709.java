package day19;

public class tolowercase709 {
    
}
class Solution {
    public String toLowerCase(String s) {
       String result="";
       for(int i=0;i<s.length;i++){
        char ch = s.charAt(i);
        if(65<=ch && ch<=90){
            result += (char)(char + 32);
        }else{
            result +=ch;
        }
       } 
       return result;
    }
}