package Recursion;

import java.util.ArrayList;
import java.util.List;

public class LinearSearchMultipleOccurence {

    static List<Integer> li=new ArrayList<>();
    public static void main(String[] args) {
        int[] arr={1,2,5,3,4,5,5};
        int target=5;
        System.out.println(search(arr,0,target));
    }

    public static List<Integer> search(int[] arr,int index,int target) {

        if(arr[index]==target){
            li.add(index);
        }

        if(index == arr.length-1){
            return li;
        }
        
        return search(arr, index+1,target);
    }
    
}
