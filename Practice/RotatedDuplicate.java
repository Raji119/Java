public class RotatedDuplicate {

        public static void main(String[] args) {
            int[] num={2,2,7,2,2};
            int target=3;
            int index=search(num, target);
            System.out.println(index);
    
        }
    
            public  static int search(int[] nums, int target) {
        
                int pivot = findPivot(nums);
                if(pivot == -1){
                   return binarySearch(nums,target,0,nums.length-1);
                }
        
                if(nums[pivot]==target){
                    return pivot;
                }
        
                if(target>=nums[0]){
                   return binarySearch(nums,target,0,pivot-1);
                }
                    return binarySearch(nums,target,pivot+1,nums.length-1);
            }
        
            public static int findPivot(int[] nums){
                int start =0;
                int end=nums.length-1;
        
                while(start<=end){
                    int mid=start+(end-start)/2;
                    if(mid<end && nums[mid]>nums[mid+1]){
                        return mid;
                    }
                    if(mid>start && nums[mid]<nums[mid-1]){
                        return mid-1;
                    }
                    if(nums[mid]==nums[start] && nums[mid]==nums[end]){
                        if(nums[start]>nums[start+1]){
                            return start;
                        }
                        if(nums[end]<nums[end-1]){
                            return end-1;
                        }
                        start++;
                        end--;
                    }
                    else if(nums[start]<nums[mid] || (nums[start]==nums[mid] && nums[end]<nums[mid])){
                        start=mid+1;
                    }else{
                        end=mid-1;
                    }
                }
                return -1;
            }
              public static int binarySearch(int[] nums,int target,int start,int end){
        
                    while(start<=end){
                        int mid=start+(end-start)/2;
        
                        if(nums[mid]==target){
                            return mid;
                        }
                        if(target<nums[mid]){
                            end=mid-1;
                        }else{
                            start=mid+1;
                        }
                    }
                    return -1;
        
                }
        
    }
    