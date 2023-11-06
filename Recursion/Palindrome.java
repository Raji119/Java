package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palin(54));
        System.out.println(palin(545));
    }

    public static boolean palin(int n){
        return n==revDigits(n);
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
