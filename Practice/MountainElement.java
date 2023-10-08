public class MountainElement {

     public static void main(String[] args) {
            int[] num={0,5,6,7,3,2,1};
            int target=3;
            int index=searchElem(num, target);
            System.out.println(index);

        }

        public static int searchElem(int[] nums,int target){
            int peak=peak(nums);
            int findStart=orderAgnoisticBinarySearch(nums,target,0,peak);
            if(findStart!=-1){
                return findStart;
            }
            int findEnd=orderAgnoisticBinarySearch(nums,target,peak,nums.length-1);
            return findEnd;
            
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
    
            return start;
        }

        public static int orderAgnoisticBinarySearch(int[] nums,int target,int start,int end){

            boolean isAsc=nums[start]<nums[end];

            while(start<=end){
                int mid=start+(end-start)/2;

                if(nums[mid]==target){
                    return mid;
                }

                if(isAsc){
                    if(target<nums[mid]){
                        end=mid-1;
                    }else{
                        start=mid+1;
                    }
                }else{
                    if(target<nums[mid]){
                        start=mid+1;
                    }else{
                        end=mid-1;
                    }
                }
            }
            return -1;

        }

    
}

    

