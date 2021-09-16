import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{-1}, 1);
//        merge(new int[]{1}, 1, new int[]{},0);
//        merge(new int[]{0}, 0, new int[]{1},1);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        //loop over alle elementen van nums2
        //loop over alle elementen van nums1
        //kijk of element even groot is voeg dan toe op zelfde index
        //kijk of element op eerste index kleiner is dan het element dan kun je daar meteen toevoegen
        //kijk of element het grootste is als ja swap
        //als element groter is dan i en kleiner dan i +1 plaats element

        for (int i = 0; i < nums2.length; i++) {
            for (int i1 = 0; i1 < nums1.length; i1++) {
                if (nums2[i]<nums1[i1]){
                    for (int i2 = i1; i2 < nums1.length; i2++) {

                    }
                }
            }
        }
//        while (index != (nums1.length + nums2.length)) {
//            
//            index--;
//        }
//        System.out.println(Arrays.toString(nums1));
        
        
    }
}
