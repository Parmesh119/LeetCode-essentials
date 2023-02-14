class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s=0,e=numbers.length-1;
        while(s<=e){
            //int sum=numbers[s]+numbers[e];
            if(numbers[s]+numbers[e]>target) e-=1;
            else if(numbers[s]+numbers[e]<target) s+=1;
            else return new int[]{s+1,e+1};
        }
        return new int[]{s+1,e+1};
}
}