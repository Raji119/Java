package Sorting;

import java.util.Scanner;

public class MergeSort{
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
     mergeSort(A,n);
     System.out.println("\nAfter Sorting:");
     display(A,n);

     sc.close();
 }

 public static void display(int A[],int n){
    for(int i=0;i<n;i++)
      System.out.print(A[i]+" ");
 }

 public static void mergeSort(int A[],int n){
 
    int p,i,l,mid,h;

    for(p=2;p<=n;p=p*2){
        for(i=0;i+p-1<n;i+=p){
            l=i;
            h=i+p-1;
            mid=(l+h)/2;
            merge(A,l,mid,h);
        }
    }
    if(p/2<n){
     merge(A,0,p/2-1,n-1);
    }
 }

 public static void merge(int A[],int l,int mid,int h){
   
    int i,j,k;

    int[] B=new int[h*2];

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