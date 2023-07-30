package DecreaseAndConquer;

import java.util.Scanner;

public class InsertionSort{
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter a Array Limit:");
     int n=sc.nextInt();
     
     int[] A=new int[n+1];

     System.out.println("Enter "+n+" Array Elements");
     for(int i=0;i<n;i++)
        A[i]=sc.nextInt();

     System.out.println("Before Sorting:");
     display(A,n);
     sort(A,n);
     System.out.println("After Sorting:");
     display(A,n);

     sc.close();
 }

 public static void display(int A[],int n){
    for(int i=0;i<n;i++)
      System.out.println(A[i]);
 }

 public static void sort(int A[],int n){
    int i=1,j,p;
    while(i<n){
        p=A[i];
        j=i-1;
        while(j>=0 && A[j]>p){
            A[j+1]=A[j];
            j--;
        }
        A[j+1]=p;
        i++;
    }
 }
}