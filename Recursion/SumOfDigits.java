package Recursion;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(sumDigits(5456));
    }

    public static int sumDigits(int n){

        if(n==0){
            return 0;
        }
        return sumDigits(n/10)+n%10;
    }
}
