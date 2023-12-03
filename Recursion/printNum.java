package Recursion;

public class printNum {

    public static void main(String[] args) {
        func1(5);
        func2(5);
    }

    public static void func2(int n) {
        //Prints 1 2 3 4 5 
          if(n==0){
            return;
        }
        func2(n-1);
        System.out.println(n);

    }

    public static void func1(int n) {
        //Prints 5 4 3 2 1
        if(n==0){
            return;
        }
        System.out.println(n);
        func1(n-1);
    }
    
}
