import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num_2=0;
        for(int i=0;i<nums1.length;i++){
            if(i>=m){
                nums1[i]=nums2[num_2];
                if(num_2<n)
                    num_2++;
            }
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}