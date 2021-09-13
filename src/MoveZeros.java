import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
//        moveZeroes(new int[]{0,1,0,3,12});
        moveZeroes(new int[]{1,2,3,1});
    }

    public static void moveZeroes(int[] nums) {
        if (nums.length == 1) {
            System.out.println(Arrays.toString(nums));
        } else if (nums.length == 2) {
            if (nums[0] == 0) {
                nums[0] = nums[1];
                nums[1] = 0;
            }
        } else {
            int j = 0, i = 0;
            while (j != nums.length - 1) {
                if (nums[j] == 0 && j != nums.length - 1) {
                    j++;
                }
                if (nums[i] != 0 && i != nums.length - 1) {
                    i++;
                }
                if (nums[i] == 0 && nums[j] != 0) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }


}
