package Recursion;

import java.util.Arrays;

public class MergeSort {
     public static void main(String[] args) {

        int[] arr={3,6,2,1};
        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    public static int[] mergeSort(int[] arr){

        if(arr.length==1){
            return arr;
        }

        int mid=(arr.length)/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
      
    }

    public static int[] merge(int[] left, int[] right) {
        
        int[] res=new int[left.length+right.length];
        int i,j,k;
        i=j=k=0;

        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                res[k]=left[i];
                i++;
            }else{
                res[k]=right[j];
                j++;
            }
            k++;
        }

        while(i<left.length){
            res[k]=left[i];
            k++;i++;
        }

         while(j<right.length){
            res[k]=right[j];
            k++;j++;
        }

        return res;

    }

    
}
