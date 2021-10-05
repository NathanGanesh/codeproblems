import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class TheRealTwoSum {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] resultArr = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target-nums[i])) {
                    return new int[]{i, hashMap.get(target-nums[i])};
            }else{
                hashMap.put(nums[i],i);
            }

        }
        return resultArr;
    }
}
