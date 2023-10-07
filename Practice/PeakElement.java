public class PeakElement {

    public static void main(String[] args) {
        int[] num={0,5,6,7,3,2,1};
        int peak=peak(num);

        System.out.println(peak);

    }

    public  static int peak(int[] nums){
        int start=0;
        int end=nums.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }else if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }
        }

        return nums[start];
    }
  }

    
