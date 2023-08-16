
package Sorting;

import java.util.Scanner;

public class QuickSort{
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
     quickSort(A,0,n);
     System.out.println("\nAfter Sorting:");
     display(A,n);

     sc.close();
 }

 public static void display(int A[],int n){
    for(int i=0;i<n;i++)
      System.out.print(A[i]+" ");
 }

 public static void quickSort(int[] A,int l,int h){
    int j;
    if(l<h){
        j=partition(A,l,h);
        quickSort(A,l,j);
        quickSort(A,j+1,h);
    }
 }

 public static int partition(int A[],int l,int h){
   
    int pivot=A[l];
    int i=l,j=h;

    do{
        do{i++;}while(A[i]<=pivot && i<h);
        do{j--;}while(A[j]>pivot && j>=0);
        if(i<j){
            swap(A,i,j);
        }
    }while(i<j);
    swap(A,l,j);

    return j;
 }


  public static void swap(int[] A,int i,int j){
    int temp=A[i];
    A[i]=A[j];
    A[j]=temp;
  }
}