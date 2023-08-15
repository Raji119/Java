package Sorting;

import java.util.Scanner;

public class RecursiveMergeSort{
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
     mergeSort(A,0,n-1);
     System.out.println("\nAfter Sorting:");
     display(A,n);

     sc.close();
 }

 public static void display(int A[],int n){
    for(int i=0;i<n;i++)
      System.out.print(A[i]+" ");
 }

 public static void mergeSort(int A[],int l,int h){
 
    if(l<h){
        int mid=(l+h)/2;
        mergeSort(A,l,mid);
        mergeSort(A,mid+1,h);
        merge(A,l,mid,h);
    }
 }

 public static void merge(int A[],int l,int mid,int h){
   
    int i,j,k;

    int[] B=new int[h+10];

    i=l;
    j=mid+1;
    k=l;
    while(i<=mid && j<=h){
        if(A[i]<A[j]){
            B[k++]=A[i++];
        }else{
            B[k++]=A[j++];
        }
    }
    for(;i<=mid;i++)
        B[k++]=A[i];
    for(;j<=h;j++)
        B[k++]=A[j];

    for(i=l;i<=h;i++){
        A[i]=B[i];
    }
    
 }

}