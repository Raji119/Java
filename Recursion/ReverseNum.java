package Recursion;

public class ReverseNum {

    public static void main(String[] args) {
        System.out.println(revDigits(54));
    }

    public static String revDigits(int n){

        if(n==0){
            return "";
        }
        return n%10+revDigits(n/10)+"";
    }
    
}
