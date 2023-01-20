import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int cnt=0,element=0,max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                }else{
                    break;
                }
            }
            if(cnt>max){
                element=nums[i];
                max=cnt;
            }
            cnt=0;
        }
        return element;
    }
}