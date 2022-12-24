import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] ignoredNums1, int[] nums2) {
        int[] arr = new int[nums2.length + ignoredNums1.length];
        int s = 0, e = arr.length - 1;
        for (int i = 0; i < arr.length; i++) 
            if (i < ignoredNums1.length) 
                arr[i] = ignoredNums1[i];
        for (int i = 0; i < nums2.length; i++) 
            arr[ignoredNums1.length + i] = nums2[i];
        Arrays.sort(arr);
        if(arr.length%2!=0)
            return arr[arr.length / 2];
        else{
            //index1 = arr.length / 2;
            //index2 = (arr.length - 1) / 2;
            double ans1 = arr[arr.length / 2];
            double ans2 = arr[(arr.length - 1) / 2];
            return (ans1+ans2)/2;
        }
    }
}
