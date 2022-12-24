class Solution {
    public boolean isPalindrome(int x) {
        String str=Integer.toString(x);
        int s=0,e=str.length()-1;
        while(s<e){
            if(str.charAt(s)==str.charAt(e)){
                s++;
                e--;
            }else
                return false;
        }
        return true;
    }
}