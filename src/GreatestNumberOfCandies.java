import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies {
    public static void main(String[] args) {
//        kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
//    kidsWithCandies(new int[]{4,2,1,1,2},1);
//        kidsWithCandies(new int[]{12,1,12}, 10);
        kidsWithCandies(new int[]{2,3,5,1,3},3);
     }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> isBiggestKidsWithCandies = new ArrayList<>();
        boolean isBiggest;
        for (int i = 0; i < candies.length; i++) {
            isBiggest = true;
            for (int i1 = 0; i1 < candies.length; i1++) {
                if (!(candies[i] + extraCandies >= candies[i1] )) {
                    isBiggest = false;
                    isBiggestKidsWithCandies.add(false);
                    break;
                }
            }
            if (isBiggest) {
                isBiggestKidsWithCandies.add(true);
            }
        }
        System.out.println(isBiggestKidsWithCandies);
        return isBiggestKidsWithCandies;
    }
}
