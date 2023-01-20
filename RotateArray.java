class Solution {
    public void rotate(int[] nums, int k) {
        int[] ans=new int[nums.length];
        //ArrayList<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            ans[(i+k)%nums.length]=nums[i];
            //l.add((i+k)%nums.length);
        }
        for(int i=0; i<ans.length; i++){
            nums[i]=ans[i];
        }
        
    }
}