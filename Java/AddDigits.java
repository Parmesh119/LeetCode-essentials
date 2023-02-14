class Solution {
    public int addDigits(int num) {
        int num1=0,num2=0,ans=0;
        if(num<10 && num>=0){
            return num;
        }else{
            while(num>=10){
                //num1=num%10;
                //num2=num/10;
                num=(num%10)+(num/10);
                //num=ans;
            }
        }
        return num;
    }
}