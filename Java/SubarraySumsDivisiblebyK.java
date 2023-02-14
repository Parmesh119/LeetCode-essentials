class SubarraySumsDivisiblebyK {
    public int subarraysDivByK(int[] nums, int k) {
        if (k == 0) {
            return k;
        }
        int cnt = 0, sum = 0;
        int[] rem = new int[k];
            for (int j = 0; j < nums.length; j++) {
                sum = sum + nums[j];
                if(sum % k == 0){
                    cnt++;
                }
                cnt += rem[(sum % k + k) % k] ++;
            }
        return cnt;
    }
}