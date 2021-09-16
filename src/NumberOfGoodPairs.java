import java.util.HashMap;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
//        numIdenticalPairs(new int[]{1,2,3,1,1,3});
//        numIdenticalPairs(new int[]{1,1,1,1});
        numIdenticalPairs(new int[]{1,2,3});
    }
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = i+1; i1 < nums.length; i1++) {
                if (nums[i] == nums[i1]){
                    count++;
                }
            }
        }
        return count;
    }
}
