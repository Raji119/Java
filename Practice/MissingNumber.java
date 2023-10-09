public class MissingNumber {
    
     public static void main(String[] args) {
        int[] nums={5,2,1,3,0};
        System.out.println(missingNum(nums));
        
    }

    public static int missingNum(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        for(i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return nums.length;

    }

    public static void swap(int[] nums,int i1,int i2){
        int temp=nums[i1];
        nums[i1]=nums[i2];
        nums[i2]=temp;
    }

}
