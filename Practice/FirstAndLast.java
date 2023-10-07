import java.util.Arrays;

public class FirstAndLast {

        public static void main(String[] args) {
            int[] bin={0,5,6,7,7,7,7,7,7,7,7,8,9};
            int target=7;
            int[] pos=searchRange(bin,target);

            System.out.println(Arrays.toString(pos));

        }
        public  static int[] searchRange(int[] nums, int target) {
    
            int[] ans={-1,-1};
    
            ans[0]=findIndex(nums,target,true);
            if(ans[0]!=-1){
                ans[1]=findIndex(nums,target,false);
            }
            return ans;
        }
    
        public  static int findIndex(int[] nums,int target,boolean startIndex){
            int start=0;
            int end=nums.length-1;
            int ans=-1;
    
            while(start<=end){
                int mid=start+(end-start)/2;
                if(target<nums[mid]){
                    end=mid-1;
                }else if(target>nums[mid]){
                    start=mid+1;
                }else{
                    ans=mid;
                    if(startIndex){
                        end=mid-1;
                    }else{
                        start=mid+1;
                    }
                }
            }
    
            return ans;
        }
}
