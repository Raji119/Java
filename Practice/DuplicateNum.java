public class DuplicateNum {
    
        public static void main(String[] args) {
           int[] nums={5,2,1,3,0,2};
           System.out.println(dupNum(nums));
           
       }
   
       public static int dupNum(int[] nums){
           int i=0;
           while(i<nums.length){

            if(nums[i]!=i+1){
               int correct=nums[i];
               if(nums[i]!=nums[correct]){
                   swap(nums, i, correct);
               }else{
                   return nums[i];
               }
            }else{
                i++;
            }
        }
            return -1;

   
       }
   
       public static void swap(int[] nums,int i1,int i2){
           int temp=nums[i1];
           nums[i1]=nums[i2];
           nums[i2]=temp;
       }
   
   }
   
