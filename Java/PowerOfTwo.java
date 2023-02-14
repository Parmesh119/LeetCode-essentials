class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean ans=false;
        int i=0;
        double num=n;
        while(num>=Math.pow(2,i)) {
            if (num == Math.pow(2, i)) {
                ans = true;
                break;
            }
            i++;
        }
        return ans;
    }
}