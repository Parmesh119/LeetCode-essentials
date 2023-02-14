class Solution {
    public boolean isPerfectSquare(int num) {
        if(answer(num)) return true;
        else return false;
    }
    static boolean answer(int n){
        double sqrt=n;
        double answer=Math.sqrt(sqrt);
        int ans=(int)answer;
        if((ans*ans)==n) return true;
        else return false;
    }
}