class Solution {
    public int trailingZeroes(int n) {
        int fC = 0;
        while(n!=0){
        n/=5;
        fC+=n;
        }
        return fC;
    }
}