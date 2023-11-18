package Recursion;

import java.util.Arrays;

public class SelectionSort {
     public static void main(String[] args) {

        int[] arr={3,6,2,1};
        sort(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
        
    }

    public static void sort(int[] arr,int r,int c,int k){

        if(r==0){
            return;
        }

        if(c<r){
          if(arr[c]>arr[k]){
            k=c;
          }
          sort(arr,r,c+1,k);
       }
        else{
            int temp=arr[r];
            arr[r]=arr[k];
            arr[k]=temp;
            sort(arr,r-1,0,0);
        }
    }

    
}
