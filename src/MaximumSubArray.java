public class MaximumSubArray {
    public static void main(String[] args) {
//        maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
//        maxSubArray(new int[]{1});
//        maxSubArray(new int[]{5, 4, -1, 7, 8});
        maxSubArray(new int[]{-2,-1});
    }

    public static int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int currentSum;
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            currentSum = 0;
            for (int i1 = i; i1 < nums.length; i1++) {
                currentSum += nums[i1];
                if (currentSum > sum) {
                    sum = currentSum;
                }
            }
        }

        System.out.println(sum);
        return sum;

    }
}
