class Solution {
    public int strStr(String haystack, String needle) {
        /*int s1=0,s2=0;
        int ans=0,cnt=0;
        if(needle.length()>haystack.length()){
            return -1;
        }
        if(needle==null){
            return 0;
        }
        while(s2<needle.length()){
            while(s1<haystack.length()){
                if(haystack.charAt(s1)==needle.charAt(s2)){
                    ans=s1;
                    cnt++;
                    break;
                }
                s1++;
            }
            s2++;
            s1=0;
            if(ans>=0 && cnt>0){
                return ans;
            }else{
                return -1;
            }
        }
        return -1;*/
        if(haystack==null || needle==null)    
        return 0;
 
    if(needle.length() == 0)
        return 0;
 
    for(int i=0; i<haystack.length(); i++){
        if(i + needle.length() > haystack.length())
            return -1;

        int m = i;
        for(int j=0; j<needle.length(); j++){
            if(needle.charAt(j)==haystack.charAt(m)){
                if(j==needle.length()-1)
                    return i;
                m++;
            }else{
                break;
            }

        }    
    }   

    return -1;
    }
}