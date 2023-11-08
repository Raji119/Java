package Recursion;

public class SunOfN {

    public static void main(String[] args) {
        System.out.println(sumN(5));
    }

    public static int sumN(int n){

        if(n<=1){
            return 1;
        }
        return n+sumN(n-1);
    }
    
}
