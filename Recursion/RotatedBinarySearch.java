package Recursion;

public class RotatedBinarySearch {

    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        int target=1;
       System.out.println(rotatedBinSearch(arr, target, 0, arr.length-1));
    }

    public static int rotatedBinSearch(int[] arr,int target,int s,int e){
        
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        
        if(arr[mid]==target){
            return mid;
        }
        if(arr[s]<=arr[mid]){
          if(target>=arr[s] && target<=arr[mid]){
            return rotatedBinSearch(arr, target, s, mid-1);
          }else{
            return rotatedBinSearch(arr, target, mid+1, e);
          }
        }

        if(target>=arr[mid] && target<=arr[e]){
            return rotatedBinSearch(arr, target, mid+1, e);
        }
        return rotatedBinSearch(arr, target, s, mid-1);
    }
    
}
