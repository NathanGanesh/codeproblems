import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
    }

    public static int removeDuplicates(int[] nums) {
        int currentValue = -1;
        int currentArrayIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            //if the current value is not equal to the value found at the array this means that we found an unique item lets then set the currentValue to this new unique found item
            if (currentValue != nums[i]) {
                currentValue = nums[i];
                nums[currentArrayIndex] = nums[i];
                currentArrayIndex++;
            } else {
                //so we didnt found an unique value lets then set the value found there to -100
//                nums[i] = -100;
            }
        }
        return currentArrayIndex;
    }
}
