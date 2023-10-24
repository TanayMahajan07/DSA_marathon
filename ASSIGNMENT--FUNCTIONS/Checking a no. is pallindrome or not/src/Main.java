public class Main {
    static boolean isPalindrome(int n){
        int temp=n;   int r;   int reverse=0;
        while(n>0){
            r=n%10;
            reverse=reverse*10+r;
            n=n/10;
        }
        System.out.println(reverse);
        if(temp==reverse){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(12233221));


    }
}