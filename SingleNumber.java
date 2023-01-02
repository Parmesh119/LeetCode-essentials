class Solution {
    public int singleNumber(int[] nums) {
        int u=0;
        for(int i:nums){
            u^=i;
        }
        return u;
    }
}