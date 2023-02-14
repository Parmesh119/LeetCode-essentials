public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int cnt=0;
        int d=n-1;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(d)==' '){
                d-=1;
                continue;
        }
            else{
                if(s.charAt(i)!=' ')
                    cnt++;
                else
                    break;
            }
        }
        return cnt;
    }
}
