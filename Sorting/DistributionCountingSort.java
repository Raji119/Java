package Sorting;

import java.util.Scanner;

public class DistributionCountingSort{
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
     A=distributionCoutingSort(A,n);
     System.out.println("\nAfter Sorting:");
     display(A,n);

     sc.close();
 }

 public static void display(int A[],int n){
    for(int i=0;i<n;i++)
      System.out.print(A[i]+" ");
 }

 public static int[] distributionCoutingSort(int A[],int n){
    
    int max=getMax(A,n);
    int min=getMin(A,n);
    int bound=max-min+1;

    int[] D=new int[bound];
    int[] S=new int[n+1];

    int i,j;
    for(i=0;i<bound;i++){
        D[i]=0;
    }

    for(i=0;i<n;i++){
        D[A[i]-min]=D[A[i]-min]+1;
    }

    for(i=1;i<bound;i++){
        D[i]=D[i-1]+D[i];
    }

    for(i=n-1;i>=0;i--){
        j=A[i]-min;
        S[D[j]-1]=A[i];
        D[j]=D[j]-1;
    }
    return S;

 }

 public static int getMax(int[] A,int n){
    int max=A[0];
    for(int i=0;i<n;i++){
        if(A[i]>max){
            max=A[i];
        }
    }
    return max;
 }

 public static int getMin(int[] A,int n){
    int min=A[0];
    for(int i=0;i<n;i++){
        if(A[i]<min){
            min=A[i];
        }
    }
    return min;
 }
}

