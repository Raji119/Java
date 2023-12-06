package Recursion;

public class ProductOfDigits {

    public static void main(String[] args) {
        System.out.println(prodDigits(54));
    }

    public static int prodDigits(int n){

        if(n%10==n){
            return n;
        }
        return n%10*prodDigits(n/10);
    }
    
}
