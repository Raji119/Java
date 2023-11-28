package Recursion;

import java.util.Arrays;

public class MergeSortInplace {

         public static void main(String[] args) {

        int[] arr={3,6,2,1};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
        
    }

    public static void mergeSort(int[] arr,int s,int e){

        if(e-s==1){
            return;
        }

        int mid=(s+e)/2;

        mergeSort(arr,0,mid);
        mergeSort(arr, mid, e);

        merge(arr,s,mid,e);
      
    }

    public static void merge(int[] arr,int s,int m,int e) {
        
        int[] res=new int[e-s];
        int i=s;
        int j=m;
        int k=0;

        while(i<m && j<e){
            if(arr[i]<arr[j]){
                res[k]=arr[i];
                i++;
            }else{
                res[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<m){
            res[k]=arr[i];
            k++;i++;
        }

         while(j<e){
            res[k]=arr[j];
            k++;j++;
        }

        for(i=0;i<res.length;i++){
            arr[s+i]=res[i];
        }

    }
    
}
