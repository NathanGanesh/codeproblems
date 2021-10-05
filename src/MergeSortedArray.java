import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
//        merge(new int[]{1, 2, 3, 0}, 3, new int[]{2}, 1);
//        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
//        merge(new int[]{0}, 0, new int[]{1}, 1);
        merge(new int[]{2,3,  0}, 1, new int[]{1}, 1);
//        merge(new int[]{1}, 1, new int[]{},0);
//        merge(new int[]{0}, 0, new int[]{1},1);
//        int[] arr = new int[]{1, 2, 3, 0};
//        for (int i1 = 1; i1 < arr.length - 1; i1++) {
//            System.out.println(i1);
//            arr[i1] = arr[i1 - 1];
//        }
//        System.out.println(Arrays.toString(arr));
//        shiftAllElementsByOne(new int[]{1, 2, 3, 0, 0, 0}, 3, 5, 3);
//        int[] ints = new int[]{1, 2, 3, 0};

//        for (int l = ints.length - 1; l > 0; l--) {
//            ints[l] = ints[l - 1];
//        }
//        System.out.println(Arrays.toString(ints));


    }


//    nums1[1, 2, 3, 0, 0, 0] = i, nums2[2,5,6]=j

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int loopAmount = m + n;
        n--;
        m--;
        loopAmount--;
        if (m != -1) {
            while (m >= 0 && n >= 0) {
                if (nums2[n] > nums1[m]) {
                    nums1[loopAmount] = nums2[n];
                    n--;
                } else if (nums2[n] < nums1[m]) {
                    nums1[loopAmount] = nums1[m];
                    m--;
                } else if (nums2[n] == nums1[m]) {
                    nums1[loopAmount] = nums2[n];
                    n--;
                }
//                loopAmount--;
            }
            System.out.println(Arrays.toString(nums1));
        } else {
            nums1[0] = nums2[0];
            System.out.println(Arrays.toString(nums1));
        }
    }
}
