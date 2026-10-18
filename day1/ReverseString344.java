package day1;
import java.util.*;
public class ReverseString344 {
    public static void main (String []args){
        Scanner sc= new Scanner(System.in);
        char[] str= sc.next().toCharArray();
        reverseString(str);
         System.out.println(str);
        sc.close();
    }
       public static void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}

