package Sorting;

import java.util.Scanner;

public class ComparisonCoutingSort{
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
     A=comparisonCoutingSort(A,n);
     System.out.println("\nAfter Sorting:");
     display(A,n);

     sc.close();
 }

 public static void display(int A[],int n){
    for(int i=0;i<n;i++)
      System.out.print(A[i]+" ");
 }

 public static int[] comparisonCoutingSort(int A[],int n){
    int i,j;
    int[] count=new int[n+1];
    int[] S = new int[n+1];

    for(i=0;i<n;i++){
        count[i]=0;
    }

    for(i=0;i<n-1;i++){
        for(j=i+1;j<n;j++){
            if(A[i]<A[j]){
                count[j]++;
            }else{
                count[i]++;
            }
        }
    }

    for(i=0;i<n;i++){
        S[count[i]]=A[i];
    }
    return S;
 }
}
