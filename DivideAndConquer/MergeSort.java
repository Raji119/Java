

import java.util.Scanner;

public class MergeSort {
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
        sort(A);
        System.out.println("After Sorting:");
        display(A,n);
        

        sc.close();
    }

    public static void display(int A[],int n){
        for(int i=0;i<n;i++)
          System.out.println(A[i]);
     }

    public static void sort(int A[]){
        int n=A.length;
        int[] B=new int[n/2];
        int[] C=new int[n/2+2];
        int i,k;
    
        if(n>1){
            for(i=0;i<n/2-1;i++)
                B[i]=A[i];
            for(i=n/2-1,k=0;i<n;i++,k++)
                C[k]=A[i];
            display(B, B.length);
            display(C,C.length);
            sort(B);
            sort(C);
            merge(B,C,A);
        }
    }

    public static void merge(int B[],int C[],int A[]){
        int i=0,j=0,k=0;
        while(i<B.length  && j<C.length){
            if(B[i]<=C[j]){
                A[k]=B[i];
                i++;
            }else{
                A[k]=C[j];
                j++;
            }
            k++;
        }
        if(i==B.length){
            while(j<C.length){
                A[k]=A[j];
                j++;
                k++;
            }
        }else{
            while(i<B.length){
                A[k]=A[i];
                i++;
                k++;
            }
        }
    }
    
}
