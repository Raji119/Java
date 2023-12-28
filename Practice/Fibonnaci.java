import java.util.Scanner;

public class Fibonnaci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n =sc.nextInt();

        if(n>0){
            System.out.println("The Fibonacci Series is: \n0");
            if(n>1){
                System.out.println(1);
                if(n>2){
                    int f0=0,f1=1,f2;
                    for(int i=3;i<=n;i++){
                        f2=f1+f0;
                        f0=f1;
                        f1=f2;
                        System.out.println(f2);
                    }
                }
            }
        }else{
            System.out.println("Fibonnaci Series Cannot be Generated");
        }
        sc.close();
    }
    
}
