class Solution {
    public boolean isPowerOfThree(int n) {
        boolean ans=false;
        int i=0;
        double num=n;
        while(num>=Math.pow(3,i)) {
            if (num == Math.pow(3, i)) {
                ans = true;
                break;
            }
            i++;
        }
        return ans;
    }
}