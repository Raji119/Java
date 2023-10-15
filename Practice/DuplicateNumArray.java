import java.util.ArrayList;
import java.util.List;

public class DuplicateNumArray {

    public static void main(String[] args) {
        int[] nums={5,2,1,3,2,3};
        System.out.println(dupNum(nums));
        
    }

    public static List<Integer> dupNum(int[] nums){
      
         int i=0;
          List<Integer> li=new ArrayList<>();
           while(i<nums.length){
               int correct=nums[i]-1;
               if(nums[i]!=nums[correct]){
                   swap(nums, i, correct);
               }else{
                   i++;
               }
           }

           for(i=0;i<nums.length;i++){
               if(nums[i]!=i+1){
                   li.add(nums[i]);
               }
           }
            return li;
       }


    public static void swap(int[] nums,int i1,int i2){
        int temp=nums[i1];
        nums[i1]=nums[i2];
        nums[i2]=temp;
    }

}
