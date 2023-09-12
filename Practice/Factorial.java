import java.util.Scanner;

public class Factorial {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("Enter n:");
    n=sc.nextInt();

    int fact=1;
    if(n>=0){
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        System.out.println("Fact= "+fact);
    }
    else{
        System.out.println("Factorial is Not possible");
    }
    sc.close();
   } 
}
