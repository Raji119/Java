import java.util.Arrays;

public class SetMismatch {

    public static void main(String[] args) {
        int[] nums={4,2,1,2};
        System.out.println(Arrays.toString(dupNum(nums)));
        
    }

    public static int[] dupNum(int[] nums){
        int i=0,crct;

        while(i<nums.length){
            crct=nums[i]-1;
            if(nums[i]!=nums[crct]){
                swap(nums,i,crct);
            }else{
                i++;
            }
        }

        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return new int[]{nums[i],i+1};
            }
        }

        return new int[]{-1,-1}; 


    }

    public static void swap(int[] nums,int i1,int i2){
        int temp=nums[i1];
        nums[i1]=nums[i2];
        nums[i2]=temp;
    }

    
}
