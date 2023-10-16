public class FirstMissingPositive {

    public static void main(String[] args) {
        int[] nums={-1,2,4,1};
        System.out.println(missingNum(nums));
        
    }

    public static int missingNum(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        for(i=0;i<nums.length;i++){
            if(i+1!=nums[i]){
                return i+1;
            }
        }
        return nums.length+1;

    }

    public static void swap(int[] nums,int i1,int i2){
        int temp=nums[i1];
        nums[i1]=nums[i2];
        nums[i2]=temp;
    }

    
}
