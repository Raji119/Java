package Recursion;

public class ReverseNum2 {

    public static void main(String[] args) {
        System.out.println(revDigits(54));
    }

    public static int revDigits(int n){

        int digits=(int)Math.log10(n)+1;
        return helper(n,digits);
    }

    public static int helper(int n, int digits) {
        if(n%10==0){
            return n;
        }
        int rem=n%10;
        return (int)(rem * Math.pow(10,digits-1)+helper(n/10, digits-1));
    }

    
    
}
