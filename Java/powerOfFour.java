class Solution {
    public boolean isPowerOfFour(int n) {
        boolean ans=false;
        int i=0;
        double num=n;
        while(num>=Math.pow(4,i)) {
            if (num == Math.pow(4, i)) {
                ans = true;
                break;
            }
            i++;
        }
        return ans;
    }
}