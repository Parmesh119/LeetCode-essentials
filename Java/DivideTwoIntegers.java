public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if(dividend<0 && divisor<0){
            if(dividend==Integer.MIN_VALUE && divisor==-1){
                return Integer.MAX_VALUE;
            }
        }
        return dividend/divisor;  
    }
}
