import java.util.HashMap;

public class JewelAndStones {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbb"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        char[] jewelsCharArray = jewels.toCharArray();
        char[] stonesCharArray = stones.toCharArray();
        int count = 0;
        HashMap<Character, Integer> jewelsHashMap = new HashMap<>();
        for (int i = 0; i < jewelsCharArray.length; i++) {
            if (jewelsHashMap.containsKey(jewelsCharArray[i])){
                jewelsHashMap.put(jewelsCharArray[i], jewelsHashMap.get(jewelsCharArray[i])+1);
            }else{
                jewelsHashMap.put(jewelsCharArray[i], 1);
            }
        }

        for (int i = 0; i < stonesCharArray.length; i++) {
            if (jewelsHashMap.containsKey(stonesCharArray[i])) {
                count += jewelsHashMap.get(stonesCharArray[i]);
            }
        }

        return count;
    }
}
