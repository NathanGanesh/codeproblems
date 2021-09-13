import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class BestTimetoBuyandSellStockII {

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{3, 3, 4, 5, 5}));
    }

    public static int containsDuplicate(int[] nums) {
        int amountOfLoops = nums.length % 2 == 0 ? nums.length / 2 : nums.length / 2 + 1;
        boolean evenLoops = nums.length % 2 == 0;
        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 0; i < amountOfLoops; i++) {
            System.out.println(i);
            if (i == amountOfLoops - 1 && !evenLoops) {
                //check the current element and the previous element
                if (nums[i * 2] != nums[i * 2 - 1]) {
                    return nums[i * 2];
                }
            }
            if (nums.length - 1 != i + 1) {
                System.out.println("");
                if (nums[i] != nums[i + 1]) {
                    if (nums[i + 1] == nums[i + 2]) {
                        return nums[i];
                    }
                }
            }
        }
        return 0;
    }
}
