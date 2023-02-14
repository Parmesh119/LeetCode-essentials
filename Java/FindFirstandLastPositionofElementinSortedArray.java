class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=0,e=nums.length-1;
        while(s<=e){
            while(s<=e){
                if(nums[s]==target && nums[e]==target) return new int[]{s,e}; 
                else e--;   
            }
            s++;
            e=nums.length-1;
        }
        return new int[]{-1,-1};
    }
    }