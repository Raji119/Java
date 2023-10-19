package Sorting;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] nums={5,2,4,1,3};
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
        
    }

    public static void cyclicSort(int[] nums){
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]-1!=i){
        //         swap(nums,i,nums[i]-1);
        //         i--;
        //     }
        // }
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

    }

    public static void swap(int[] nums,int i1,int i2){
        int temp=nums[i1];
        nums[i1]=nums[i2];
        nums[i2]=temp;
    }
    
}
