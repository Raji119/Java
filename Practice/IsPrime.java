import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter an Number:");
        n=sc.nextInt();
        String val=isPrime(n)?"a":"not a";
        System.out.println(n+" is "+val+" Prime Number");

        sc.close();
    }

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }else if(n%2==0){
            return false;
        }else{
            for(int i=3;i<Math.sqrt(n)+1;i+=2)
                if(n%i==0)
                    return false;
        }
        return true;
    }
    
}
