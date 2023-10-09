import java.util.ArrayList;
import java.util.List;

public class MultipleMissingNum {

    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public  static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> li = new ArrayList<>();

        int i=0;

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
                li.add(i+1);
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
