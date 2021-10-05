import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
//        shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3);
        shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4);
//        shuffle(new int[]{1, 1, 2, 2}, 2);
//        System.out.println(0%2==0);
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ints = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ints[i] = i % 2 == 0 ? nums[i/2] : nums[n + (i/2)];
        }
//        System.out.println(Arrays.toString(ints));

        return ints;
    }
}
