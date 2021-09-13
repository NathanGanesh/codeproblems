import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Intesection {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{1, 2, 2, 1}, new int[]{2})));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        int nums1Length = nums1.length;
        int nums2Length = nums2.length;
        int[] arrayValues = new int[nums2.length];
        int i = 0, k = 0, j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while (i < nums1Length && j < nums2Length) {
            if (nums2[j] > nums1[i]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                arrayValues[k++] = nums1[i];
                i++;
                j++;
            }
        }
        return arrayValues;
//        ArrayList<Integer> intersectionValues = new ArrayList<>();
//        boolean[] indexHolder = new boolean[nums1.length];
//        for (int i = 0; i < nums2.length; i++) {
//            for (int i1 = 0; i1 < nums1.length; i1++) {
//                if (nums1[i1] == nums2[i]) {
//                    if (!indexHolder[i1]) {
//                        intersectionValues.add(nums2[i]);
//                        indexHolder[i1] = true;
//                        break;
//                    }
//                }
//            }
//        }
//        int[] insectionArrayValues = new  int[intersectionValues.size()];
//        for (int i = 0; i < intersectionValues.size(); i++) {
//            insectionArrayValues[i] = intersectionValues.get(i);
//        }
    }
}
