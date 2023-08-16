package Sorting;

import java.util.Scanner;

public class SelectionSort{
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
     selectionSort(A,n);
     System.out.println("\nAfter Sorting:");
     display(A,n);

     sc.close();
 }

 public static void display(int A[],int n){
    for(int i=0;i<n;i++)
      System.out.print(A[i]+" ");
 }

 public static void selectionSort(int A[],int n){
    int i,j,k,temp;
    for(i=0;i<n-1;i++){
        for(j=k=i;j<n;j++){
            if(A[j]<A[k]){
                k=j;
            }
        }
        temp=A[i];
        A[i]=A[k];
        A[k]=temp;
    }
 }
}