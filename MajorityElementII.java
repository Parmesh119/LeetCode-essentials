import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> l=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        int e=nums.length/3;
        Arrays.sort(nums);
        int cnt=0;
        int[] count=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                }
            }
            count[i]=cnt;
            cnt=0;
        }
        for(int i=0;i<nums.length;i++){
            if(count[i]>e){
                set.add(nums[i]);
            }
        }
        for(int i:set){
            l.add(i);
        }
        return l;
    }
}