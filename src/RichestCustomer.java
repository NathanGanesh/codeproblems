import java.util.Arrays;

public class RichestCustomer {
    public static void main(String[] args) {
//        maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}});
        maximumWealth(new int[][]{{1,5},{7,3},{3,5}});
//        maximumWealth(new int[][]{{2,8,7},{7,1,3},{1,9,5}});
    }

    public static int maximumWealth(int[][] accounts) {
        int largestSum = 0;
        int indexCustomer = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sumCustomer = 0;
            for (int i1 = 0; i1 < accounts[i].length; i1++) {
                sumCustomer += accounts[i][i1];
                if (sumCustomer > largestSum && accounts[i].length-1 == i1) {
                    largestSum = sumCustomer;
                    indexCustomer = i;
                }
            }
        }
        return largestSum;
    }
}
