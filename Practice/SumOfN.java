import java.util.Scanner;

class SumOfN{
 public static void main(String[] args){

  Scanner sc=new Scanner(System.in);

  System.out.println("Enter a Number:");
  int n=sc.nextInt();

  if(n>0){
    int sum=0;
    for(int i=1;i<=n;i++)
	sum+=i;
    System.out.println(sum);
  }else{
   System.out.println("Invalid Input");
  }
 }
}
