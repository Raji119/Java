package Sorting;

import java.util.Scanner;

public class BubbleSort {

    public static void display(int[] A){
        for(int i:A){
            System.out.print(i+" ");
        }
    }

    public static void bubbleSort(int[] A,int n){
        int temp,flag;
        for(int i=0;i<n-1;i++){
            flag=0;
            for(int j=0;j<n-1-i;j++){
                if(A[j]>A[j+1]){
                    temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){
                return;
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Limit:");
        int n=sc.nextInt();

        int[] A=new int[n];

        System.out.println("Enter "+n+" Elements:");
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }

        System.out.println("Before Sorting:");
        display(A);

        bubbleSort(A,n);
        System.out.println("\nAfter Sorting:");
        display(A);

        sc.close();

    }
}
