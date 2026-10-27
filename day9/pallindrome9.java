package day9;
class pallindrome9 {
    public static void main(String[] args) {
        pallindrome9 p = new pallindrome9();
        System.out.println(p.isPalindrome(121));
    }
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int reverse = 0;
        int xcopy= x;
        while(x>0){
            reverse =(reverse * 10)+(x% 10);
            x/=10;
        }
         return reverse ==xcopy;
   
    }
}