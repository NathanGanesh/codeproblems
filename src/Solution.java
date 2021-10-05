import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] ints = countPoints(new int[][]{{1, 3}, {3, 3}, {5, 3}, {2, 2}}, new int[][]{{2, 3, 1}, {4, 3, 1}, {1, 1, 2}});
//        System.out.println(Arrays.toString(ints));
//        [[1,3],[3,3],[5,3],[2,2]]
//        [[2,3,1],[4,3,1],[1,1,2]]
    }

    public static int[] countPoints(int[][] points, int[][] queries) {
        int[] arrayCounter = new int[queries.length];
        //you have the circles and you want to loop over all circles
        for (int i = 0; i < queries.length; i++) {
//            System.out.println(Arrays.toString(queries[i]));
            for (int z = 0; z < points.length; z++) {
                int pointX = points[z][0];
                int pointY = points[z][1];
                boolean b = checkIfPointInRangeCircle(pointX, pointY, queries[i]);
                System.out.println(b);
                if (b) {
                    arrayCounter[i] = arrayCounter[i] + 1;
                }
            }
        }
        return arrayCounter;
    }

    public static boolean checkIfPointInRangeCircle(int pointX, int pointY, int[] circle) {
        int circleX = circle[0];
        int circleY = circle[1];
        int circleRad = circle[2];

        //if the raduis from point x, y is smaller then or equal to the raduis it means the point is inside the circle;[
        //(x − h)^2 + (y − k)^2 = r^2
        //1.0
        if (Math.pow((pointX - circleX), 2) + Math.pow((pointY - circleY), 2) <= Math.pow(circleRad, 2)) {
            return true;
        } else {
            return false;
        }


    }
}