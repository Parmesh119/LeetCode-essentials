import java.util.ArrayList;
import java.util.Collections;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }
        l.add(target);
        Collections.sort(l);
        return l.indexOf(target);
    }    
}
