class Solution {
    public int countPrimes(int n) {
        int ans=0;
        boolean[] prime=new boolean[n+1];
        if(n==0 || n==1 || n==2)
            return 0;
        for (int i = 2; i*i < n ; i++) {
            if(!prime[i]){
                for (int j = i*2; j < n; j+=i) {
                    prime[j]=true;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if(!prime[i]){
                ans++;
            }
        }
        return ans;
    }
}