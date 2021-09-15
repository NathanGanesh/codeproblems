import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
//        buildArray(new int[]{1, 2, 1}); //1 2 1 1 2 1
        buildArray(new int[]{1,3,2,1}); // 1,3,2,1,1,3,2,1
//        [1,3,2,1]
    }

    public static int[] buildArray(int[] nums) {
        int i = nums.length * 2;
        int[] arr = new int[i];
        for (int i1 = 0; i1 < nums.length; i1++) {
            arr[i1] = nums[i1];
        }
        int secondLoop = nums.length % 2 == 0 ? nums.length * 2 : nums.length * 2 - 1;
        for (int i1 = nums.length; i1 < nums.length * 2; i1++) {
            arr[i1] = nums[i1-nums.length];
        }


        return arr;
    }
}
