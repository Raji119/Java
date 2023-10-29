package Recursion;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=5;
        System.out.println(search(arr,0,target));
    }

    public static int search(int[] arr,int index,int target) {

        if(arr[index]==target){
            return index;
        }

        if(index == arr.length-1){
            return -1;
        }
        
        return search(arr, index+1,target);
    }
    
}
