package alertservice;

import java.util.HashMap;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        int[] returnIndices = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < list.length; i++) {
            if (hashMap.containsKey(sum-list[i])){
                    returnIndices[0] = i;
                    returnIndices[1] = hashMap.get(sum-list[i]);
                    return returnIndices;
            }else{
                hashMap.put(list[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}
