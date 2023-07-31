package DivideAndConquer;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Array Limit:");
        int n=sc.nextInt();
        
        int[] A=new int[n+1];
   
        System.out.println("Enter "+n+" Array Elements");
        for(int i=0;i<n;i++)
           A[i]=sc.nextInt();
   
        System.out.println("Enter Search Element:");
        int key=sc.nextInt();
        
        int pos=binarySearch(A,key,0,n);
        System.out.println((pos==-1)?"Key not Found":"Key Found at position : "+(pos+1));

        sc.close();
        
    }
    public static int binarySearch(int[] arr,int key,int low,int high){

        if(low<=high){

            int mid=(low+high)/2;

            if(arr[mid]==key)
                return mid;

            else if(key>arr[mid])
                return binarySearch(arr,key,mid+1,high);
                
            else
                return binarySearch(arr,key,low,mid-1);
        }
        return -1;

    }
}
