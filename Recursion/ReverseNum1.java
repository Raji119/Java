package Recursion;

public class ReverseNum1 {

    static int sum=0;

    public static void main(String[] args) {
        revDigits(56);
        System.out.println(sum);
    }

    public static void revDigits(int n){

        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        revDigits(n/10);
    }
    
}
